package com.forsale.app.ui.bottomsheets.support;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.ContactData;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.SupportActionType;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import wz.p;
/* compiled from: SupportCallUsViewModel.kt */
/* loaded from: classes3.dex */
public final class SupportCallUsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final CoroutineExceptionHandler f39121k0;

    /* renamed from: l0  reason: collision with root package name */
    public List<ContactData> f39122l0;

    /* renamed from: m0  reason: collision with root package name */
    private OneShotEventHandler<ContactData> f39123m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39124n0;

    /* compiled from: SupportCallUsViewModel.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$1", f = "SupportCallUsViewModel.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f39125a;

        /* renamed from: b  reason: collision with root package name */
        int f39126b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SupportCallUsViewModel supportCallUsViewModel;
            f11 = b.f();
            int i11 = this.f39126b;
            if (i11 != 0) {
                if (i11 == 1) {
                    supportCallUsViewModel = (SupportCallUsViewModel) this.f39125a;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SupportCallUsViewModel supportCallUsViewModel2 = SupportCallUsViewModel.this;
                this.f39125a = supportCallUsViewModel2;
                this.f39126b = 1;
                Object w02 = supportCallUsViewModel2.w0(this);
                if (w02 == f11) {
                    return f11;
                }
                supportCallUsViewModel = supportCallUsViewModel2;
                obj = w02;
            }
            supportCallUsViewModel.D0((List) obj);
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("Support Screen: " + message, new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCallUsViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f39121k0 = new a(CoroutineExceptionHandler.Key);
        this.f39123m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39124n0 = new OneShotEventHandler<>(null, 0, 3, null);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    private final void C0(String str) {
        AggregatedAllAnalyticsLoggerKt.I0(r(), SupportActionType.SUPPORT_PHONE_NUMBER_CLICKED, str, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(zz.a<? super java.util.List<com.forsale.app.datalayer.database.ContactData>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$getContactData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$getContactData$1 r0 = (com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$getContactData$1) r0
            int r1 = r0.f39130c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39130c = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$getContactData$1 r0 = new com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel$getContactData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f39128a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39130c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.repositories.RegionsRepository r5 = r4.I()
            r0.f39130c = r3
            java.lang.Object r5 = r5.getCurrentRegion(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            com.forsale.app.datalayer.database.RegionEntity r5 = (com.forsale.app.datalayer.database.RegionEntity) r5
            java.util.List r5 = r5.getContactData()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel.w0(zz.a):java.lang.Object");
    }

    public final OneShotEventHandler<p> A0() {
        return this.f39124n0;
    }

    public final boolean B0() {
        if (this.f39122l0 != null) {
            return true;
        }
        return false;
    }

    public final void D0(List<ContactData> list) {
        o.i(list, "<set-?>");
        this.f39122l0 = list;
    }

    public final void E0(int i11) {
        if (B0()) {
            ContactData contactData = x0().get(i11);
            C0(contactData.getPhone());
            this.f39123m0.i(contactData);
            this.f39124n0.i(p.f75480a);
        }
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        CompletableJob Job$default;
        Job$default = JobKt__JobKt.Job$default(null, 1, null);
        return Job$default.plus(Dispatchers.getIO()).plus(this.f39121k0);
    }

    public final List<ContactData> x0() {
        List<ContactData> list = this.f39122l0;
        if (list != null) {
            return list;
        }
        o.w("contactData");
        return null;
    }

    public final String y0(int i11) {
        if (B0()) {
            return x0().get(i11).getName();
        }
        return "";
    }

    public final OneShotEventHandler<ContactData> z0() {
        return this.f39123m0;
    }
}
