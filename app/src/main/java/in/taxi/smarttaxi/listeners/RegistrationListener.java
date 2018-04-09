package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.AuthBean;

public interface RegistrationListener {

    void onLoadCompleted(AuthBean authBean);

    void onLoadFailed(String error);

}
