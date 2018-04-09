package in.taxi.smarttaxi.listeners;


import in.taxi.smarttaxi.model.PromoCodeBean;

public interface PromoCodeListener {

    void onLoadCompleted(PromoCodeBean promoCodeBean);

    void onLoadFailed(String error);

}
