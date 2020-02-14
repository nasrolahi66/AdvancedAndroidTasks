package com.example.advancedandroidtask4

class Presenter(val view:Contract.parentView):Contract.Presenter {
    val model=Model(this)

    override fun btnSearchCityClicked() {
        val countryAndCity=  (view as Contract.SearchView).getCountryAndCity()
        model.fillTimes(countryAndCity.second,countryAndCity.first)
        model.fillDate("Iran")
    }

    override fun btnTimesClicked() {
        (view as Contract.MainView).openDrawer()
    }

    override fun BtnSearchClicked() {
        (view as Contract.MainView).OpenSearchPage()
    }

    override fun showResultPage(){
        (view as Contract.SearchView).OpenResultPage(model)
    }
}