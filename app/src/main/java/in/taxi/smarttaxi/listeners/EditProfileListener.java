package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.UserBean;

public interface EditProfileListener {

    void onLoadCompleted(UserBean userBean);

    void onLoadFailed(String error);

}
