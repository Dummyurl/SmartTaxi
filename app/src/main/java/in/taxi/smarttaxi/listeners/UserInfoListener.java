package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.UserBean;

public interface UserInfoListener {

    void onLoadCompleted(UserBean userBean);

    void onLoadFailed(String error);

}
