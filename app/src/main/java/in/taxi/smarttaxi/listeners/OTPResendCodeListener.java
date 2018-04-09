package in.taxi.smarttaxi.listeners;

import in.taxi.smarttaxi.model.BasicBean;

public interface OTPResendCodeListener {

    void onLoadCompleted(BasicBean basicBean);

    void onLoadFailed(String error);
}
