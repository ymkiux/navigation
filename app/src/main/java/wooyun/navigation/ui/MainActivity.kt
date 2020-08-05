package wooyun.navigation.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*
import wooyun.navigation.R
import wooyun.navigation.fragment.HomeFragment
import wooyun.navigation.fragment.MessageFragment
import wooyun.navigation.fragment.MyFragment
import wooyun.navigation.fragment.ShopFragment

class MainActivity : AppCompatActivity() {
    private var f1: HomeFragment? = null
    private var f2: ShopFragment? = null
    private var f3: MessageFragment? = null
    private var f4: MyFragment? = null
    private var fragmentManager: FragmentManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager = supportFragmentManager
        f1 = HomeFragment()
        f2 = ShopFragment()
        f3 = MessageFragment()
        f4 = MyFragment()
        val transaction =
                fragmentManager!!.beginTransaction()
        transaction.add(R.id.fl, f1!!)
        transaction.commit()
    }
    fun show1() {
        iv_home.setImageResource(R.drawable.ic_home)
        tv_home.setTextColor(resources.getColor(R.color.main))
        iv_shop.setImageResource(R.drawable.ic_shop)
        tv_shop.setTextColor(resources.getColor(R.color.line))
        iv_message.setImageResource(R.mipmap.dialog_unselect)
        tv_message.setTextColor(resources.getColor(R.color.line))
        im_my.setImageResource(R.mipmap.my_unselect)
        tv_my.setTextColor(resources.getColor(R.color.line))
    }

    fun show2() {
        iv_home.setImageResource(R.drawable.ic_home_c)
        tv_home.setTextColor(resources.getColor(R.color.line))
        iv_shop.setImageResource(R.drawable.ic_shop_sec)
        tv_shop.setTextColor(resources.getColor(R.color.main))
        iv_message.setImageResource(R.mipmap.dialog_unselect)
        tv_message.setTextColor(resources.getColor(R.color.line))
        im_my.setImageResource(R.mipmap.my_unselect)
        tv_my.setTextColor(resources.getColor(R.color.line))
    }

    fun show3() {
        iv_home.setImageResource(R.drawable.ic_home_c)
        tv_home.setTextColor(resources.getColor(R.color.line))
        iv_shop.setImageResource(R.drawable.ic_shop)
        tv_shop.setTextColor(resources.getColor(R.color.line))
        iv_message.setImageResource(R.mipmap.dialog_select)
        tv_message.setTextColor(resources.getColor(R.color.main))
        im_my.setImageResource(R.mipmap.my_unselect)
        tv_my.setTextColor(resources.getColor(R.color.line))
    }

    fun show4() {
        iv_home.setImageResource(R.drawable.ic_home_c)
        tv_home.setTextColor(resources.getColor(R.color.line))
        iv_shop.setImageResource(R.drawable.ic_shop)
        tv_shop.setTextColor(resources.getColor(R.color.line))
        iv_message.setImageResource(R.mipmap.dialog_unselect)
        tv_message.setTextColor(resources.getColor(R.color.line))
        im_my.setImageResource(R.mipmap.my_select)
        tv_my.setTextColor(resources.getColor(R.color.main))
    }


    fun set1(view: View?) {
        val transaction =
                fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fl, f1!!)
        transaction.commit()
        show1()
    }

    fun set2(view: View) {
        val transaction =
                fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fl, f2!!)
        transaction.commit()
        show2()
    }

    fun set3(view: View?) {
        val transaction =
                fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fl, f3!!)
        transaction.commit()
        show3()
    }


    fun set4(view: View?) {
        val transaction =
                fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fl, f4!!)
        transaction.commit()
        show4()
    }
}