package com.forsale.app.features.more.blockreason;

import androidx.databinding.ObservableField;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.services.UserService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import jj.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import t9.y0;
import wz.p;
/* compiled from: BlockReasonViewModel.kt */
/* loaded from: classes2.dex */
public final class BlockReasonViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final b f31694k0;

    /* renamed from: l0  reason: collision with root package name */
    private final UserService f31695l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ApplicationResourcesRepository f31696m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<String> f31697n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31698o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31699p0;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BlockReasonViewModel f31700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, BlockReasonViewModel blockReasonViewModel) {
            super(key);
            this.f31700a = blockReasonViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f31700a.z0().k(this.f31700a.f31696m0.getString(y0.F0, new Object[0]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockReasonViewModel(b prefs, UserService userService, ApplicationResourcesRepository resourcesRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(userService, "userService");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        this.f31694k0 = prefs;
        this.f31695l0 = userService;
        this.f31696m0 = resourcesRepository;
        this.f31697n0 = new ObservableField<>("loading...");
        this.f31698o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31699p0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y0(zz.a<? super String> aVar) {
        return this.f31694k0.c().a(aVar);
    }

    public final OneShotEventHandler<p> A0() {
        return this.f31698o0;
    }

    public final OneShotEventHandler<p> B0() {
        return this.f31699p0;
    }

    public final void C0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new BlockReasonViewModel$loadBlockingReason$1(this, null), 3, null);
    }

    public final void D0() {
        this.f31698o0.i(p.f75480a);
    }

    public final void E0() {
        this.f31699p0.i(p.f75480a);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
    }

    public final ObservableField<String> z0() {
        return this.f31697n0;
    }
}
