package mobin.expandablerecyclerview.models

import mobin.expandablerecyclerview.adapters.ExpandableRecyclerViewAdapter

data class Parent(val name: String) : ExpandableRecyclerViewAdapter.ExpandableGroup<Child>() {

    override fun getExpandingItems(): List<Child> = ArrayList<Child>(10).apply {
        for (i in 0 until 10)
            add(Child("Child $i"))
    }
}