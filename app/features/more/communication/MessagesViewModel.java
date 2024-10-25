package com.forsale.app.features.more.communication;

import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.SessionRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: MessagesViewModel.kt */
/* loaded from: classes2.dex */
public final class MessagesViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final SessionRepository f31857k0;

    /* renamed from: l0  reason: collision with root package name */
    private final UserProfileInteractor f31858l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31859m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f31860n0;

    /* renamed from: o0  reason: collision with root package name */
    private final StateFlow<Boolean> f31861o0;

    /* compiled from: MessagesViewModel.kt */
    @d(c = "com.forsale.app.features.more.communication.MessagesViewModel$1", f = "MessagesViewModel.kt", l = {44, 45}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.communication.MessagesViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31862a;

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
            f11 = b.f();
            int i11 = this.f31862a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        return p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                UserProfileInteractor userProfileInteractor = MessagesViewModel.this.f31858l0;
                this.f31862a = 1;
                obj = userProfileInteractor.r(this);
                if (obj == f11) {
                    return f11;
                }
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            MutableStateFlow mutableStateFlow = MessagesViewModel.this.f31860n0;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(booleanValue);
            this.f31862a = 2;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MessagesViewModel f31864a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, MessagesViewModel messagesViewModel) {
            super(key);
            this.f31864a = messagesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f31864a), null, null, new MessagesViewModel$coroutineContext$1$1(th2, this.f31864a, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModel(SessionRepository sessionRepository, UserProfileInteractor userProfileInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(sessionRepository, "sessionRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(baseRepository, "baseRepository");
        this.f31857k0 = sessionRepository;
        this.f31858l0 = userProfileInteractor;
        this.f31859m0 = new OneShotEventHandler<>(null, 0, 3, null);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f31860n0 = MutableStateFlow;
        this.f31861o0 = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        B0();
    }

    private final void B0() {
        AggregatedAllAnalyticsLoggerKt.q0(r(), true, true);
    }

    private final void z0() {
        AggregatedAllAnalyticsLoggerKt.F(r());
    }

    public final void A0() {
        OneShotEventHandler.d(this.f31859m0, null, 1, null);
    }

    public final void C0() {
        z0();
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
    }

    public final OneShotEventHandler<p> x0() {
        return this.f31859m0;
    }

    public final StateFlow<Boolean> y0() {
        return this.f31861o0;
    }
}
