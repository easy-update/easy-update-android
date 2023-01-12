package app.easyupdate.easyupdate

interface UpdateCheckCallBack {
    fun onSuccess(data:String)
    fun onError(data:String)
}