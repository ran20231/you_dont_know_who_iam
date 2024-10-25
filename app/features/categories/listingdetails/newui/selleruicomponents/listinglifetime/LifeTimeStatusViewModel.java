package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingExtendStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOptionType;
import com.forsale.app.datalayer.network.responses.listingdetails.OtherStatus;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.o0;
import t9.q0;
import t9.y0;
import wz.p;
/* compiled from: LifeTimeStatusViewModel.kt */
/* loaded from: classes2.dex */
public final class LifeTimeStatusViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final Object f27759a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingLifeTimeItemViewModel f27760b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<Drawable> f27761c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<Drawable> f27762d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<String> f27763e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<String> f27764f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<SpannableString> f27765g;

    /* renamed from: h  reason: collision with root package name */
    private final LiveData<SpannableString> f27766h;

    /* renamed from: i  reason: collision with root package name */
    private final b0<SpannableString> f27767i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<SpannableString> f27768j;

    /* renamed from: k  reason: collision with root package name */
    private final ApplicationResourcesRepository f27769k;

    /* renamed from: l  reason: collision with root package name */
    private final String f27770l;

    /* compiled from: LifeTimeStatusViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27771a;

        static {
            int[] iArr = new int[ListingPinOptionType.values().length];
            try {
                iArr[ListingPinOptionType.PROMOTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingPinOptionType.PINNING_SHUFFLE_WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingPinOptionType.WAITING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingPinOptionType.PINNING_SHUFFLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListingPinOptionType.PINING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ListingPinOptionType.PINNING_POWER_PIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ListingPinOptionType.PINNING_POWER_PIN_WAITING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f27771a = iArr;
        }
    }

    public LifeTimeStatusViewModel(Object status, ListingLifeTimeItemViewModel listingLifeTimeItemViewModel) {
        o.i(status, "status");
        o.i(listingLifeTimeItemViewModel, "listingLifeTimeItemViewModel");
        this.f27759a = status;
        this.f27760b = listingLifeTimeItemViewModel;
        b0<Drawable> b0Var = new b0<>();
        this.f27761c = b0Var;
        this.f27762d = b0Var;
        b0<String> b0Var2 = new b0<>();
        this.f27763e = b0Var2;
        this.f27764f = b0Var2;
        b0<SpannableString> b0Var3 = new b0<>();
        this.f27765g = b0Var3;
        this.f27766h = b0Var3;
        b0<SpannableString> b0Var4 = new b0<>();
        this.f27767i = b0Var4;
        this.f27768j = b0Var4;
        this.f27769k = listingLifeTimeItemViewModel.m().y1();
        this.f27770l = "yyyy-MM-dd HH:mm:ss";
        x10.a.b("Status:: " + status, new Object[0]);
        if (status instanceof ListingPinOption) {
            s((ListingPinOption) status);
        } else if (status instanceof ListingExtendStatus) {
            r((ListingExtendStatus) status);
        } else if (status instanceof OtherStatus) {
            t((OtherStatus) status);
        }
    }

    private final int d(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        o.h(lowerCase, "toLowerCase(...)");
        if (o.d(lowerCase, "4sale")) {
            return this.f27769k.getColor(o0.f69330g);
        }
        if (o.d(lowerCase, "q8car")) {
            return this.f27769k.getColor(o0.f69343t);
        }
        throw new IllegalArgumentException(str + " do not have any corresponding colors");
    }

    private final int e(ListingPinOptionType listingPinOptionType) {
        switch (a.f27771a[listingPinOptionType.ordinal()]) {
            case 1:
                return q0.O2;
            case 2:
            case 3:
                return q0.f69824y2;
            case 4:
            case 5:
                return q0.N2;
            case 6:
            case 7:
                return q0.I1;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String f(ListingPinOption listingPinOption) {
        int i11;
        com.forsale.app.features.categories.listingdetails.a t11 = TypeExtensionsKt.t(listingPinOption.getTime(), this.f27770l);
        switch (a.f27771a[listingPinOption.getType().ordinal()]) {
            case 1:
                i11 = y0.f70782z6;
                break;
            case 2:
            case 3:
                i11 = y0.G6;
                break;
            case 4:
            case 5:
                i11 = y0.f70734w6;
                break;
            case 6:
                i11 = y0.f70766y6;
                break;
            case 7:
                i11 = y0.E6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27769k.getString(i11, new Object[0]));
        sb2.append(" ");
        sb2.append(this.f27769k.getString(y0.G4, new Object[0]));
        sb2.append(" ");
        w wVar = w.f61809a;
        String format = String.format("%d:%d.", Arrays.copyOf(new Object[]{Integer.valueOf(t11.b()), Integer.valueOf(t11.c())}, 2));
        o.h(format, "format(...)");
        sb2.append(format);
        String sb3 = sb2.toString();
        o.h(sb3, "toString(...)");
        return sb3;
    }

    private final String g(ListingPinOption listingPinOption, String str, String str2) {
        int n11 = n(listingPinOption.getType());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f27769k.getString(n11, new Object[0]));
        if (str2 != null) {
            String string = this.f27769k.getString(y0.f70685t5, new Object[0]);
            sb2.append(" " + string + " " + str2 + ", " + str);
        } else {
            String string2 = this.f27769k.getString(y0.f70685t5, new Object[0]);
            sb2.append(" " + string2 + " " + str);
        }
        String string3 = this.f27769k.getString(y0.f70365a5, new Object[0]);
        String app = listingPinOption.getApp();
        sb2.append(" " + string3 + " " + app + ".");
        String sb3 = sb2.toString();
        o.h(sb3, "toString(...)");
        return sb3;
    }

    private final void h(ListingPinOption listingPinOption) {
        String placement = listingPinOption.getPlacement();
        if (placement == null) {
            BuildersKt__Builders_commonKt.launch$default(this.f27760b.m(), null, null, new LifeTimeStatusViewModel$getCategoryName$2$1(this, listingPinOption, null), 3, null);
        } else {
            q(placement, listingPinOption.getDistrictId());
        }
    }

    private final void i(String str, int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f27760b.m(), null, null, new LifeTimeStatusViewModel$getDistrict$1(this, i11, str, null), 3, null);
    }

    private final String l(com.forsale.app.features.categories.listingdetails.a aVar, int i11) {
        if (i11 != 0 && aVar != null) {
            return this.f27769k.getString(y0.f70654r6, Integer.valueOf(aVar.a()), Integer.valueOf(aVar.b()), Integer.valueOf(aVar.c()));
        }
        return "";
    }

    private final String m(com.forsale.app.features.categories.listingdetails.a aVar, int i11) {
        if (aVar == null) {
            String dateExpired = this.f27760b.l().getDateExpired();
            if (dateExpired != null) {
                aVar = TypeExtensionsKt.t(dateExpired, this.f27770l);
            } else {
                aVar = null;
            }
        }
        if (i11 == 0) {
            if (aVar != null) {
                return this.f27769k.getString(y0.f70670s6, Integer.valueOf(aVar.a()), Integer.valueOf(aVar.b()), Integer.valueOf(aVar.c()));
            }
            return "";
        }
        return this.f27769k.getString(y0.f70686t6, Integer.valueOf(i11));
    }

    private final int n(ListingPinOptionType listingPinOptionType) {
        switch (a.f27771a[listingPinOptionType.ordinal()]) {
            case 1:
                return y0.A6;
            case 2:
            case 3:
                return y0.F6;
            case 4:
            case 5:
                return y0.f70718v6;
            case 6:
                return y0.f70750x6;
            case 7:
                return y0.D6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String p(int i11) {
        return this.f27769k.getString(y0.f70702u6, Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(String str, Integer num) {
        p pVar;
        if (num != null) {
            i(str, num.intValue());
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            v(this, str, null, 2, null);
        }
    }

    private final void r(ListingExtendStatus listingExtendStatus) {
        com.forsale.app.features.categories.listingdetails.a aVar;
        String nextRefreshDate = listingExtendStatus.getNextRefreshDate();
        if (nextRefreshDate != null) {
            aVar = TypeExtensionsKt.t(nextRefreshDate, this.f27770l);
        } else {
            aVar = null;
        }
        String p11 = p(listingExtendStatus.getTotalNoRefreshes());
        String m11 = m(aVar, listingExtendStatus.getRemainingNoRefreshes());
        String l11 = l(aVar, listingExtendStatus.getRemainingNoRefreshes());
        b0<SpannableString> b0Var = this.f27765g;
        b0Var.postValue(new SpannableString(p11 + "\n" + m11 + "\n" + l11));
        this.f27763e.postValue(listingExtendStatus.getIcon());
    }

    private final void s(ListingPinOption listingPinOption) {
        if (listingPinOption.getIconUrl() != null) {
            this.f27763e.postValue(listingPinOption.getIconUrl());
        } else {
            this.f27761c.postValue(this.f27769k.getDrawable(e(listingPinOption.getType())));
        }
        h(listingPinOption);
    }

    private final void t(OtherStatus otherStatus) {
        this.f27763e.postValue(otherStatus.getIcon());
        this.f27765g.postValue(new SpannableString(otherStatus.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String str, String str2) {
        String f11;
        SpannableString w11;
        Object obj = this.f27759a;
        o.g(obj, "null cannot be cast to non-null type com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption");
        ListingPinOption listingPinOption = (ListingPinOption) obj;
        String g11 = g(listingPinOption, str, str2);
        if (g11 != null && (f11 = f(listingPinOption)) != null) {
            if (a.f27771a[listingPinOption.getType().ordinal()] == 1) {
                w11 = w(listingPinOption, g11);
            } else {
                w11 = w(listingPinOption, g11 + f11);
            }
            this.f27765g.postValue(w11);
        }
    }

    static /* synthetic */ void v(LifeTimeStatusViewModel lifeTimeStatusViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        lifeTimeStatusViewModel.u(str, str2);
    }

    private final SpannableString w(ListingPinOption listingPinOption, String str) {
        int a02;
        a02 = StringsKt__StringsKt.a0(str, listingPinOption.getApp(), 0, false, 6, null);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(d(listingPinOption.getApp())), a02, listingPinOption.getApp().length() + a02, 33);
        return spannableString;
    }

    public final LiveData<Drawable> j() {
        return this.f27762d;
    }

    public final LiveData<String> k() {
        return this.f27764f;
    }

    public final LiveData<SpannableString> o() {
        return this.f27766h;
    }
}
