package com.forsale.app.features.more.activityfeed;

import androidx.lifecycle.b0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.NewsFeedMessagesResponse;
import com.forsale.app.datalayer.network.services.MessagingService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import java.util.List;
import jj.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: NewsFeedViewModel.kt */
/* loaded from: classes2.dex */
public final class NewsFeedViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final b f31631l0;

    /* renamed from: m0  reason: collision with root package name */
    private final MessagingService f31632m0;

    /* renamed from: n0  reason: collision with root package name */
    private final b0<List<NewsFeedMessagesResponse.FeedMessage>> f31633n0;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewsFeedViewModel f31634a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, NewsFeedViewModel newsFeedViewModel) {
            super(key);
            this.f31634a = newsFeedViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f31634a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f31634a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedViewModel(b prefs, MessagingService messagingService, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(messagingService, "messagingService");
        o.i(baseRepository, "baseRepository");
        this.f31631l0 = prefs;
        this.f31632m0 = messagingService;
        this.f31633n0 = new b0<>();
        z0();
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
    }

    public final Object x0(zz.a<? super String> aVar) {
        return this.f31631l0.c().a(aVar);
    }

    public final b0<List<NewsFeedMessagesResponse.FeedMessage>> y0() {
        return this.f31633n0;
    }

    public final void z0() {
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NewsFeedViewModel$loadNewsFeeds$1(this, null), 3, null);
    }
}
