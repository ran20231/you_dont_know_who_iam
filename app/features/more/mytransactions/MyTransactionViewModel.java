package com.forsale.app.features.more.mytransactions;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.databinding.ObservableField;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.entities.MyTransactionEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import sj.c;
import t9.q0;
import t9.y0;
/* compiled from: MyTransactionViewModel.kt */
/* loaded from: classes2.dex */
public final class MyTransactionViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final MyTransactionEntity.Record f31984a;

    /* renamed from: b  reason: collision with root package name */
    private final ApplicationResourcesRepository f31985b;

    /* renamed from: c  reason: collision with root package name */
    private final CategoriesRepositories f31986c;

    /* renamed from: d  reason: collision with root package name */
    private final DistrictsRepository f31987d;

    /* renamed from: e  reason: collision with root package name */
    private final jj.b f31988e;

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineScope f31989f;

    /* renamed from: g  reason: collision with root package name */
    private final ForegroundColorSpan f31990g;

    /* renamed from: h  reason: collision with root package name */
    private final ObservableField<SpannableStringBuilder> f31991h;

    /* renamed from: i  reason: collision with root package name */
    private final ObservableField<SpannableStringBuilder> f31992i;

    /* renamed from: j  reason: collision with root package name */
    private final ObservableField<Drawable> f31993j;

    /* renamed from: k  reason: collision with root package name */
    private final ObservableField<String> f31994k;

    /* compiled from: MyTransactionViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31995a;

        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.PINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.PINNING_WAITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransactionType.GRAND_PINNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransactionType.PARENT_PINNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransactionType.PARENT_PINNING_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransactionType.PINNING_SHUFFLE_WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransactionType.LISTING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransactionType.LISTING_FREE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransactionType.VIDEO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransactionType.PREMIUM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransactionType.PROMOTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TransactionType.PROMOTED_PARENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TransactionType.PROMOTED_GRAND.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TransactionType.PINNING_POWER_PIN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TransactionType.GRAND_PINNING_POWER_PIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TransactionType.PARENT_PINNING_POWER_PIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TransactionType.PINNING_POWER_PIN_WAITING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TransactionType.LISTING_PLAN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TransactionType.LISTING_BUNDLE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TransactionType.LISTING_FREE_PLAN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TransactionType.LISTING_FREE_BUNDLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[TransactionType.EXTENDED.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f31995a = iArr;
        }
    }

    public MyTransactionViewModel(MyTransactionEntity.Record myTransaction, ApplicationResourcesRepository resourcesRepository, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepository, jj.b prefs, CoroutineScope scope) {
        String str;
        o.i(myTransaction, "myTransaction");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(districtsRepository, "districtsRepository");
        o.i(prefs, "prefs");
        o.i(scope, "scope");
        this.f31984a = myTransaction;
        this.f31985b = resourcesRepository;
        this.f31986c = categoriesRepositories;
        this.f31987d = districtsRepository;
        this.f31988e = prefs;
        this.f31989f = scope;
        this.f31990g = new ForegroundColorSpan(resourcesRepository.getColor(c.J));
        this.f31991h = new ObservableField<>();
        this.f31992i = new ObservableField<>();
        ObservableField<Drawable> observableField = new ObservableField<>();
        this.f31993j = observableField;
        ObservableField<String> observableField2 = new ObservableField<>();
        this.f31994k = observableField2;
        w();
        j();
        String dateCreated = myTransaction.getDateCreated();
        if (dateCreated != null) {
            str = TypeExtensionsKt.n0(dateCreated, "UTC", false, null, 6, null);
        } else {
            str = null;
        }
        observableField2.k(str);
        observableField.k(p(myTransaction.getTransactionType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(CategoryEntity categoryEntity, List<DistrictEntity> list) {
        int y11;
        String t02;
        if (!list.isEmpty()) {
            List<DistrictEntity> list2 = list;
            y11 = s.y(list2, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (DistrictEntity districtEntity : list2) {
                arrayList.add(districtEntity.getFullPathReversed());
            }
            t02 = CollectionsKt___CollectionsKt.t0(arrayList, ",", null, null, 0, null, null, 62, null);
            k(categoryEntity, t02);
            return;
        }
        l(this, categoryEntity, null, 2, null);
    }

    private final void j() {
        BuildersKt__Builders_commonKt.launch$default(this.f31989f, null, null, new MyTransactionViewModel$composeTransactionDetails$1(this, null), 3, null);
    }

    private final void k(CategoryEntity categoryEntity, String str) {
        String str2;
        TransactionType transactionType = this.f31984a.getTransactionType();
        if (transactionType != null) {
            str2 = t(transactionType);
        } else {
            str2 = null;
        }
        String string = this.f31985b.getString(y0.f70507ib, new Object[0]);
        String string2 = this.f31985b.getString(y0.f70574mb, new Object[0]);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2 + " " + string2 + " ");
        ForegroundColorSpan foregroundColorSpan = this.f31990g;
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) this.f31984a.getAddonApp());
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        if (categoryEntity != null) {
            String name = categoryEntity.getName();
            spannableStringBuilder.append((CharSequence) (" " + string + " " + name));
        }
        if (str != null) {
            spannableStringBuilder.append((CharSequence) (" " + string + " " + str));
        }
        this.f31991h.k(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void l(MyTransactionViewModel myTransactionViewModel, CategoryEntity categoryEntity, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        myTransactionViewModel.k(categoryEntity, str);
    }

    private final Drawable p(TransactionType transactionType) {
        int i11;
        if (transactionType == null) {
            i11 = -1;
        } else {
            i11 = a.f31995a[transactionType.ordinal()];
        }
        switch (i11) {
            case 1:
            case 3:
            case 4:
            case 6:
            case 14:
            case 15:
            case 16:
                return this.f31985b.getDrawable(q0.f69811v1);
            case 2:
            case 5:
            case 17:
                return this.f31985b.getDrawable(q0.f69824y2);
            case 7:
            case 8:
            case 22:
                return this.f31985b.getDrawable(q0.U0);
            case 9:
                return this.f31985b.getDrawable(q0.f69792q2);
            case 10:
                return this.f31985b.getDrawable(q0.J1);
            case 11:
            case 12:
            case 13:
                return this.f31985b.getDrawable(q0.O2);
            case 18:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return this.f31985b.getDrawable(q0.E1);
            default:
                return this.f31985b.getDrawable(q0.U0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String r(TransactionType transactionType) {
        if (transactionType == TransactionType.LISTING_FREE) {
            return this.f31985b.getString(y0.f70439eb, new Object[0]);
        }
        Integer knetTransactionId = this.f31984a.getKnetTransactionId();
        if (knetTransactionId != null) {
            knetTransactionId.intValue();
            String string = this.f31985b.getString(y0.f70523jb, new Object[0]);
            if (string != null) {
                return string;
            }
        }
        return this.f31985b.getString(y0.f70405cb, new Object[0]);
    }

    private final String t(TransactionType transactionType) {
        switch (a.f31995a[transactionType.ordinal()]) {
            case 1:
                return this.f31985b.getString(y0.f70642qb, new Object[0]);
            case 2:
                return this.f31985b.getString(y0.f70659rb, new Object[0]);
            case 3:
                return this.f31985b.getString(y0.f70473gb, new Object[0]);
            case 4:
                return this.f31985b.getString(y0.f70591nb, new Object[0]);
            case 5:
                return this.f31985b.getString(y0.f70625pb, new Object[0]);
            case 6:
                return this.f31985b.getString(y0.f70659rb, new Object[0]);
            case 7:
                return this.f31985b.getString(y0.f70540kb, new Object[0]);
            case 8:
                return this.f31985b.getString(y0.f70557lb, new Object[0]);
            case 9:
                return this.f31985b.getString(y0.f70739wb, new Object[0]);
            case 10:
                return this.f31985b.getString(y0.f70675sb, new Object[0]);
            case 11:
                return this.f31985b.getString(y0.f70691tb, new Object[0]);
            case 12:
                return this.f31985b.getString(y0.f70691tb, new Object[0]);
            case 13:
                return this.f31985b.getString(y0.f70707ub, new Object[0]);
            case 14:
                return this.f31985b.getString(y0.f70750x6, new Object[0]);
            case 15:
                return this.f31985b.getString(y0.f70490hb, new Object[0]);
            case 16:
                return this.f31985b.getString(y0.f70608ob, new Object[0]);
            case 17:
                return this.f31985b.getString(y0.D6, new Object[0]);
            case 18:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return this.f31985b.getString(y0.f70540kb, new Object[0]);
            case 22:
                return this.f31985b.getString(y0.f70422db, new Object[0]);
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(CategoryEntity categoryEntity, List<Integer> list) {
        BuildersKt__Builders_commonKt.launch$default(this.f31989f, null, null, new MyTransactionViewModel$handleDistricts$1(list, this, categoryEntity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(zz.a<? super String> aVar) {
        return this.f31988e.i().a(aVar);
    }

    private final void w() {
        BuildersKt__Builders_commonKt.launch$default(this.f31989f, null, null, new MyTransactionViewModel$setTitle$1(this, null), 3, null);
    }

    public final MyTransactionEntity.Record m() {
        return this.f31984a;
    }

    public final ObservableField<String> n() {
        return this.f31994k;
    }

    public final ObservableField<SpannableStringBuilder> o() {
        return this.f31992i;
    }

    public final ObservableField<Drawable> q() {
        return this.f31993j;
    }

    public final ObservableField<SpannableStringBuilder> s() {
        return this.f31991h;
    }
}
