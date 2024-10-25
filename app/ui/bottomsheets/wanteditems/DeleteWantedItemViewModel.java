package com.forsale.app.ui.bottomsheets.wanteditems;

import androidx.lifecycle.k0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wz.p;
/* compiled from: DeleteWantedItemViewModel.kt */
/* loaded from: classes3.dex */
public final class DeleteWantedItemViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final jj.b f39267k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ItemSubscriptionsService f39268l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ItemSubscriptionResponse f39269m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39270n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39271o0;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteWantedItemViewModel f39272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, DeleteWantedItemViewModel deleteWantedItemViewModel) {
            super(key);
            this.f39272a = deleteWantedItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f39272a.B0().i(p.f75480a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteWantedItemViewModel(jj.b prefs, ItemSubscriptionsService itemSubscriptionsService, BaseRepository baseRepository, k0 savedStateHandle) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(itemSubscriptionsService, "itemSubscriptionsService");
        o.i(baseRepository, "baseRepository");
        o.i(savedStateHandle, "savedStateHandle");
        this.f39267k0 = prefs;
        this.f39268l0 = itemSubscriptionsService;
        this.f39269m0 = f.f39287b.b(savedStateHandle).a();
        this.f39270n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39271o0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C0(ItemSubscriptionResponse itemSubscriptionResponse) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new DeleteWantedItemViewModel$logAnalytics$1(this, itemSubscriptionResponse, null), 3, null);
    }

    public final OneShotEventHandler<p> A0() {
        return this.f39270n0;
    }

    public final OneShotEventHandler<p> B0() {
        return this.f39271o0;
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
    }

    public final void z0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new DeleteWantedItemViewModel$deleteWantedItem$1(this, null), 3, null);
    }
}
