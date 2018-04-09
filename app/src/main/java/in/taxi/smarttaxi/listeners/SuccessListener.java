package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.SuccessBean;

public interface SuccessListener {

    void onLoadCompleted(SuccessBean successBean);

    void onLoadFailed(String error);
}
