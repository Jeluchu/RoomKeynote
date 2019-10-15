package soumyajitdas.com.roomviewmodelkotlinsample.Activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import soumyajitdas.com.roomviewmodelkotlinsample.Model.CountryModel

class MainActivityViewModel : ViewModel() {

    lateinit var mainActivityRepository: MainActivityRepository

    init {
        mainActivityRepository = MainActivityRepository()
    }

    fun getAllCountryList(): LiveData<List<CountryModel>>
    {
        return mainActivityRepository.getCountries()
    }

    fun getCountriesFromAPIAndStore()
    {
        mainActivityRepository.ApiCallAndPutInDB()
    }


}