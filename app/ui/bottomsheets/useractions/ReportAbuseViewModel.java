package com.forsale.app.ui.bottomsheets.useractions;

import androidx.databinding.ObservableField;
import androidx.databinding.i;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.services.AbuseReportsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DisposableHandle;
import t9.y0;
import wz.p;
/* compiled from: ReportAbuseViewModel.kt */
/* loaded from: classes3.dex */
public final class ReportAbuseViewModel extends BaseViewModel {
    private final b0<Boolean> A0;
    private final CoroutineExceptionHandler B0;
    private final c C0;

    /* renamed from: k0  reason: collision with root package name */
    private final AbuseReportsService f39178k0;

    /* renamed from: l0  reason: collision with root package name */
    private final jj.b f39179l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ApplicationResourcesRepository f39180m0;

    /* renamed from: n0  reason: collision with root package name */
    private final UserProfileInteractor f39181n0;

    /* renamed from: o0  reason: collision with root package name */
    private final Integer f39182o0;

    /* renamed from: p0  reason: collision with root package name */
    private final Integer f39183p0;

    /* renamed from: q0  reason: collision with root package name */
    private final String f39184q0;

    /* renamed from: r0  reason: collision with root package name */
    private final TranslationRepository.Translation f39185r0;

    /* renamed from: s0  reason: collision with root package name */
    private final ReportAbuseIntention f39186s0;

    /* renamed from: t0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39187t0;

    /* renamed from: u0  reason: collision with root package name */
    private final OneShotEventHandler<String> f39188u0;

    /* renamed from: v0  reason: collision with root package name */
    private final ObservableField<String> f39189v0;

    /* renamed from: w0  reason: collision with root package name */
    private final ObservableField<Boolean> f39190w0;

    /* renamed from: x0  reason: collision with root package name */
    private final int f39191x0;

    /* renamed from: y0  reason: collision with root package name */
    private final int f39192y0;

    /* renamed from: z0  reason: collision with root package name */
    private final List<DisposableHandle> f39193z0;

    /* compiled from: ReportAbuseViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        ReportAbuseViewModel a(Integer num, Integer num2, String str, TranslationRepository.Translation translation, ReportAbuseIntention reportAbuseIntention);
    }

    /* compiled from: ReportAbuseViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39194a;

        static {
            int[] iArr = new int[ReportAbuseIntention.values().length];
            try {
                iArr[ReportAbuseIntention.LISTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReportAbuseIntention.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39194a = iArr;
        }
    }

    /* compiled from: ReportAbuseViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c extends i.a {
        c() {
        }

        @Override // androidx.databinding.i.a
        public void d(i sender, int i11) {
            o.i(sender, "sender");
            String str = (String) ((ObservableField) sender).j();
            String j11 = ReportAbuseViewModel.this.z0().j();
            if (j11 != null) {
                ReportAbuseViewModel reportAbuseViewModel = ReportAbuseViewModel.this;
                int length = j11.length();
                int B0 = reportAbuseViewModel.B0();
                boolean z11 = false;
                if (length <= reportAbuseViewModel.A0() && B0 <= length) {
                    z11 = true;
                }
                if (z11) {
                    reportAbuseViewModel.L0().k(Boolean.TRUE);
                } else {
                    reportAbuseViewModel.L0().k(Boolean.FALSE);
                }
            }
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReportAbuseViewModel f39196a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, ReportAbuseViewModel reportAbuseViewModel) {
            super(key);
            this.f39196a = reportAbuseViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f39196a.h0().tryEmit(TypeExtensionsKt.g0(th2));
            this.f39196a.E0().i(this.f39196a.f39180m0.getString(y0.X4, new Object[0]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportAbuseViewModel(AbuseReportsService abuseReportsService, jj.b prefs, ApplicationResourcesRepository resourcesRepository, UserProfileInteractor userProfileInteractor, Integer num, Integer num2, String str, TranslationRepository.Translation translation, ReportAbuseIntention reportAbuseIntention, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(abuseReportsService, "abuseReportsService");
        o.i(prefs, "prefs");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(baseRepository, "baseRepository");
        this.f39178k0 = abuseReportsService;
        this.f39179l0 = prefs;
        this.f39180m0 = resourcesRepository;
        this.f39181n0 = userProfileInteractor;
        this.f39182o0 = num;
        this.f39183p0 = num2;
        this.f39184q0 = str;
        this.f39185r0 = translation;
        this.f39186s0 = reportAbuseIntention;
        this.f39187t0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39188u0 = new OneShotEventHandler<>(null, 0, 3, null);
        ObservableField<String> observableField = new ObservableField<>("");
        this.f39189v0 = observableField;
        Boolean bool = Boolean.FALSE;
        ObservableField<Boolean> observableField2 = new ObservableField<>(bool);
        this.f39190w0 = observableField2;
        this.f39191x0 = 10;
        this.f39192y0 = 1000;
        this.f39193z0 = new ArrayList();
        this.A0 = new b0<>(bool);
        this.B0 = new d(CoroutineExceptionHandler.Key, this);
        c cVar = new c();
        this.C0 = cVar;
        observableField2.k(bool);
        observableField.a(cVar);
    }

    private final void O0(String str) {
        Integer num = this.f39182o0;
        if (num != null) {
            num.intValue();
            BuildersKt__Builders_commonKt.launch$default(this, this.B0, null, new ReportAbuseViewModel$reportListing$1$1(this, str, null), 2, null);
        }
    }

    private final void P0(String str) {
        if (this.f39184q0 != null) {
            BuildersKt__Builders_commonKt.launch$default(this, this.B0, null, new ReportAbuseViewModel$reportUser$1$1(this, str, null), 2, null);
        }
    }

    public final int A0() {
        return this.f39192y0;
    }

    public final int B0() {
        return this.f39191x0;
    }

    public final Integer C0() {
        return this.f39182o0;
    }

    public final OneShotEventHandler<p> D0() {
        return this.f39187t0;
    }

    public final OneShotEventHandler<String> E0() {
        return this.f39188u0;
    }

    public final Integer G0() {
        return this.f39183p0;
    }

    public final String H0() {
        return this.f39184q0;
    }

    public final String I0() {
        int i11;
        ReportAbuseIntention reportAbuseIntention = this.f39186s0;
        if (reportAbuseIntention == null) {
            i11 = -1;
        } else {
            i11 = b.f39194a[reportAbuseIntention.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return this.f39180m0.getString(y0.Y8, new Object[0]);
            }
            return this.f39180m0.getString(y0.Y8, new Object[0]);
        }
        return this.f39180m0.getString(y0.V8, new Object[0]);
    }

    public final String J0() {
        int i11;
        ReportAbuseIntention reportAbuseIntention = this.f39186s0;
        if (reportAbuseIntention == null) {
            i11 = -1;
        } else {
            i11 = b.f39194a[reportAbuseIntention.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return this.f39180m0.getString(y0.X8, new Object[0]);
            }
            return this.f39180m0.getString(y0.Z8, new Object[0]);
        }
        return this.f39180m0.getString(y0.X8, new Object[0]);
    }

    public final b0<Boolean> K0() {
        return this.A0;
    }

    public final ObservableField<Boolean> L0() {
        return this.f39190w0;
    }

    public final void M0() {
        this.f39187t0.i(p.f75480a);
    }

    public final void N0(String comment) {
        int i11;
        o.i(comment, "comment");
        ReportAbuseIntention reportAbuseIntention = this.f39186s0;
        if (reportAbuseIntention == null) {
            i11 = -1;
        } else {
            i11 = b.f39194a[reportAbuseIntention.ordinal()];
        }
        if (i11 != 1) {
            if (i11 == 2) {
                P0(comment);
                return;
            }
            return;
        }
        O0(comment);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        for (DisposableHandle disposableHandle : this.f39193z0) {
            disposableHandle.dispose();
        }
        this.f39189v0.g(this.C0);
    }

    public final Object y0(zz.a<? super String> aVar) {
        return this.f39179l0.c().a(aVar);
    }

    public final ObservableField<String> z0() {
        return this.f39189v0;
    }
}
