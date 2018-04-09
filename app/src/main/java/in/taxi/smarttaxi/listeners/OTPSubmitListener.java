package in.taxi.smarttaxi.listeners;

import in.taxi.smarttaxi.model.OTPBean;


public interface OTPSubmitListener {

    void onLoadCompleted(OTPBean otpBean);

    void onLoadFailed(String error);

}
