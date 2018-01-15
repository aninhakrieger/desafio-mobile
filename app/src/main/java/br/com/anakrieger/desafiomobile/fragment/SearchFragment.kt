package br.com.anakrieger.desafiomobile.fragment


import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.MenuItemCompat
import android.support.v7.widget.SearchView
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.*
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import br.com.anakrieger.desafiomobile.R


/**
 * A simple [Fragment] subclass.
 */
class searchFragment : Fragment() {

    var search_menu: Menu? = null
    var toolbar: Toolbar? = null
    var searchtollbar:Toolbar? = null
    var item_search: MenuItem? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_search, container, false)
        activity.setContentView(R.layout.activity_main)
        toolbar =  activity.findViewById(R.id.toolbar) as Toolbar
        activity.actionBar. = toolbar
        setSupportActionBar(toolbar)
        setSearchtollbar()
        return view
    }

    fun initSearchView() {
        val searchView = search_menu?.findItem(R.id.action_filter_search)?.actionView as SearchView

        // Enable/Disable Submit button in the keyboard

        searchView.isSubmitButtonEnabled = false

        // Change search close button image

        val closeButton:ImageView = searchView.findViewById(R.id.search_close_btn) as ImageView

        closeButton.setImageResource(R.drawable.ic_close)


        // set hint and the text colors

        val txtSearch :EditText = searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text) as EditText
        txtSearch.hint = "Search.."
        txtSearch.setHintTextColor(Color.DKGRAY)
        txtSearch.setTextColor(resources.getColor(R.color.colorPrimary))


        // set the cursor

        val searchTextView = searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text) as AutoCompleteTextView
        try {
            val mCursorDrawableRes = TextView::class.java.getDeclaredField("mCursorDrawableRes")
            mCursorDrawableRes.isAccessible = true
            mCursorDrawableRes.set(searchTextView, R.drawable.search_cursor) //This sets the cursor resource ID to 0 or @null which will make it visible on white background
        } catch (e: Exception) {
            e.printStackTrace()
        }

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                callSearch(query)
                searchView.clearFocus()
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                callSearch(newText)
                return true
            }

            fun callSearch(query: String) {
                //Do searching
                Log.i("query", "" + query)

            }

        })

    }

    fun setSearchtollbar() {
        searchtollbar = findViewById(R.id.searchtoolbar) as Toolbar
        if (searchtollbar != null) {
            searchtollbar?.inflateMenu(R.menu.menu_search)
            search_menu = searchtollbar?.menu

            searchtollbar?.setNavigationOnClickListener({
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    circleReveal(R.id.searchtoolbar, 1, true, false)
                else
                    searchtollbar?.visibility = View.GONE
            })

            item_search = search_menu?.findItem(R.id.action_filter_search)

            MenuItemCompat.setOnActionExpandListener(item_search, object : MenuItemCompat.OnActionExpandListener {
                override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                    // Do something when collapsed
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        circleReveal(R.id.searchtoolbar, 1, true, false)
                    } else
                        searchtollbar?.visibility = View.GONE
                    return true
                }

                override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                    // Do something when expanded
                    return true
                }
            })

            initSearchView()


        } else
            Log.d("toolbar", "setSearchtollbar: NULL")
    }



}

