package `in`.taxi.smarttaxi.model


import com.google.android.gms.maps.model.LatLng

class DriverBean : BaseBean() {

    var tripID: String = ""
    var appStatus: Int = 0
    var requestStatus: String = ""
    var driverName: String = ""
    var driverPhoto: String = ""
    var driverNumber: String = ""
    var rating: Float = 0f
    var carName: String = ""
    var carNumber: String = ""
    var time: String = ""
    var carPhoto: String = ""
    var sourceLatitude: String = ""
    var sourceLongitude: String = ""
    var sourceLatLng: LatLng? = null
        get() {
            this.sourceLatLng = LatLng(dSourceLatitude, dSourceLongitude)
            return field
        }
    var destinationLatitude: String = ""
    var destinationLongitude: String = ""
    var destinationLatLng: LatLng? = null
        get() {
            this.destinationLatLng = LatLng(dDestinationLatitude, dDestinationLongitude)
            return field
        }
    var carLatitude: String = ""
    var carLongitude: String = ""
    var carLatLng: LatLng? = null
        get() {
            this.carLatLng = LatLng(dCarLatitude, dCarLongitude)
            return field
        }


    val dSourceLatitude: Double
        get() {
            try {
                return java.lang.Double.parseDouble(sourceLatitude)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                return 0.0
            }

        }

    val dSourceLongitude: Double
        get() {
            try {
                return java.lang.Double.parseDouble(sourceLongitude)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                return 0.0
            }

        }


    val dDestinationLatitude: Double
        get() {
            try {
                return java.lang.Double.parseDouble(destinationLatitude)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                return 0.0
            }

        }

    val dDestinationLongitude: Double
        get() {
            try {
                return java.lang.Double.parseDouble(destinationLongitude)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                return 0.0
            }

        }


    val dCarLatitude: Double
        get() {
            try {
                return java.lang.Double.parseDouble(carLatitude)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                return 0.0
            }

        }


    val dCarLongitude: Double
        get() {
            try {
                return java.lang.Double.parseDouble(carLongitude)
            } catch (e: NumberFormatException) {
                e.printStackTrace()
                return 0.0
            }

        }

}
