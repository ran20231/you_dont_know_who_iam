package com.forsale.app.features.categories.listings.items.dfp.banner;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.leanplum.internal.Constants;
import fj.a;
import kotlin.jvm.internal.o;
import qc.b;
import wz.p;
/* compiled from: ListingsBannerItemViewModel.kt */
/* loaded from: classes2.dex */
public final class ListingsBannerItemViewModel extends b<p> {

    /* renamed from: c  reason: collision with root package name */
    private final Integer f30651c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f30652d;

    /* renamed from: e  reason: collision with root package name */
    private final a f30653e;

    /* renamed from: f  reason: collision with root package name */
    private final GAMRepository f30654f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<Boolean> f30655g;

    /* renamed from: h  reason: collision with root package name */
    private final b0<NativeCustomFormatAd> f30656h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<NativeCustomFormatAd> f30657i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<String> f30658j;

    /* renamed from: x  reason: collision with root package name */
    private final b0<BANNERS_VIEWS> f30659x;

    /* renamed from: y  reason: collision with root package name */
    private final LiveData<BANNERS_VIEWS> f30660y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListingsBannerItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class BANNERS_VIEWS {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ BANNERS_VIEWS[] $VALUES;
        public static final BANNERS_VIEWS NATIVE_BANNER = new BANNERS_VIEWS("NATIVE_BANNER", 0);
        public static final BANNERS_VIEWS BANNER = new BANNERS_VIEWS("BANNER", 1);
        public static final BANNERS_VIEWS PLACE_HOLDER = new BANNERS_VIEWS("PLACE_HOLDER", 2);
        public static final BANNERS_VIEWS NONE = new BANNERS_VIEWS("NONE", 3);

        private static final /* synthetic */ BANNERS_VIEWS[] $values() {
            return new BANNERS_VIEWS[]{NATIVE_BANNER, BANNER, PLACE_HOLDER, NONE};
        }

        static {
            BANNERS_VIEWS[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private BANNERS_VIEWS(String str, int i11) {
        }

        public static a00.a<BANNERS_VIEWS> getEntries() {
            return $ENTRIES;
        }

        public static BANNERS_VIEWS valueOf(String str) {
            return (BANNERS_VIEWS) Enum.valueOf(BANNERS_VIEWS.class, str);
        }

        public static BANNERS_VIEWS[] values() {
            return (BANNERS_VIEWS[]) $VALUES.clone();
        }
    }

    public final LiveData<String> e() {
        return this.f30658j;
    }

    public final b0<Boolean> f() {
        return this.f30655g;
    }

    public final LiveData<BANNERS_VIEWS> g() {
        return this.f30660y;
    }

    public final AdManagerAdRequest h() {
        return this.f30654f.buildForCategoriesAndDistricts(this.f30651c, this.f30652d, this.f30653e);
    }

    public final AdManagerAdRequest i() {
        return this.f30654f.buildForCategory(this.f30651c, this.f30653e);
    }

    public final void j() {
        NativeCustomFormatAd value = this.f30657i.getValue();
        if (value != null) {
            value.performClick(Constants.Keys.INBOX_IMAGE);
        }
    }

    public final void k(NativeCustomFormatAd ad2) {
        o.i(ad2, "ad");
        this.f30656h.postValue(ad2);
    }

    public final void l(BANNERS_VIEWS viewToShow) {
        o.i(viewToShow, "viewToShow");
        if (this.f30659x.getValue() != viewToShow) {
            this.f30659x.postValue(viewToShow);
        }
    }
}
