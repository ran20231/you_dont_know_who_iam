package com.forsale.app.features.more.notifications.notification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r0;
import androidx.paging.PagedList;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.NotificationMessagesRepository;
import com.forsale.app.features.more.notifications.notification.NotificationMessagesDataSource;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
/* compiled from: NotificationMessagesViewModel.kt */
/* loaded from: classes2.dex */
public final class NotificationMessagesViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final NotificationMessagesRepository f32689l0;

    /* renamed from: m0  reason: collision with root package name */
    private final CoroutineContext f32690m0;

    /* renamed from: n0  reason: collision with root package name */
    private final Channel<Long> f32691n0;

    /* compiled from: NotificationMessagesViewModel.kt */
    @d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesViewModel$1", f = "NotificationMessagesViewModel.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.notifications.notification.NotificationMessagesViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32692a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f32692a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                Channel channel = NotificationMessagesViewModel.this.f32691n0;
                this.f32692a = 1;
                obj = channel.receive(this);
                if (obj == f11) {
                    return f11;
                }
            }
            if (((Number) obj).longValue() == 1) {
                NotificationMessagesViewModel.this.v0().postValue(ViewStates.CONTENT);
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NotificationMessagesViewModel f32694a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, NotificationMessagesViewModel notificationMessagesViewModel) {
            super(key);
            this.f32694a = notificationMessagesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if ((th2 instanceof NotificationMessagesDataSource.DataSourceException) && !this.f32694a.y0((NotificationMessagesDataSource.DataSourceException) th2)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f32694a), null, null, new NotificationMessagesViewModel$coroutineContext$1$1(this.f32694a, null), 3, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesViewModel(NotificationMessagesRepository notificationMessagesRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(notificationMessagesRepository, "notificationMessagesRepository");
        o.i(baseRepository, "baseRepository");
        this.f32689l0 = notificationMessagesRepository;
        this.f32690m0 = super.getCoroutineContext().plus(new a(CoroutineExceptionHandler.Key, this));
        this.f32691n0 = ChannelKt.Channel$default(0, null, null, 7, null);
        A0();
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    private final void A0() {
        AggregatedAllAnalyticsLoggerKt.x0(r(), AggregatedAllAnalyticsLogger.CustomEvents.NOTIFICATIONS_VISITED, false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0(NotificationMessagesDataSource.DataSourceException dataSourceException) {
        if (dataSourceException.a() == 1) {
            Throwable b11 = dataSourceException.b();
            if (b11 instanceof NotificationMessagesDataSource.EmptyDataException) {
                v0().postValue(ViewStates.Empty);
            } else if (b11 instanceof ConnectivityInterceptor.ConnectivityException) {
                v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                v0().postValue(ViewStates.ERROR);
            }
            return true;
        }
        return false;
    }

    public final void B0() {
        v0().postValue(ViewStates.LOADING);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f32690m0;
    }

    public final Object z0(zz.a<? super LiveData<PagedList<NotificationMessagesResponse.NotificationMessage>>> aVar) {
        NotificationMessagesRepository notificationMessagesRepository = this.f32689l0;
        o.g(this, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
        Channel<Long> channel = this.f32691n0;
        o.g(channel, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<kotlin.Long>");
        return notificationMessagesRepository.loadMessages(this, channel, aVar);
    }
}
