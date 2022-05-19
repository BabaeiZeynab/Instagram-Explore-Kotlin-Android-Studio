package com.zeynab.exploreinstagram

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Build.VERSION.SDK
import android.os.Build.VERSION.SDK_INT
import androidx.annotation.RequiresApi

/*
   Zeynab Babaei
   Instagram Explore
   using Glide Library
   checking users internet connectivity for android higher version and lower

 */

// this clas is to check inernet of useres
class NetworkChecker(private val context: Context) {

    // if isInternetCoonected has inernet it will return true is it does not have it will return false
    val isInternetConnected: Boolean
        get() {
            var result = false
            // we check if users net is conected or not --> we need to cas connectivityManager  we do casting
            val connectivityManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager


            // we should check version android of user and the latest one
            //  Build.VERSION.SDK_INT -> THIS IS VERSION OF USERS
            // Build.VERSION_CODES.M -> latest version
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                // if networkCapibility return retirn null return fals else return networkCapibiity
                val networkCapabilities = connectivityManager.activeNetwork?: return false
                val myInternet =
                    connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false

                result = when {

                    myInternet.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    myInternet.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                    myInternet.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                     else -> false

                }




            }// this else will check internet for phone which had android level less than 23 (M)
            else{

                result = when(connectivityManager.activeNetworkInfo?.type){
                   ConnectivityManager.TYPE_WIFI -> true
                    ConnectivityManager.TYPE_MOBILE -> true
                    ConnectivityManager.TYPE_ETHERNET -> true
                    else -> false
                }

            }
            return result
        }

}