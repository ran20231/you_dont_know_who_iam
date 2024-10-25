package com.forsale.app.features.more.notifications.notification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import ce.c;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: NotificationMessagesFragment.kt */
@d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$onCreateView$1$2", f = "NotificationMessagesFragment.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NotificationMessagesFragment$onCreateView$1$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32682a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f32683b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NotificationMessagesFragment f32684c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotificationMessagesFragment.kt */
    @d(c = "com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$onCreateView$1$2$1", f = "NotificationMessagesFragment.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$onCreateView$1$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NotificationMessagesFragment f32686b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NotificationMessagesFragment.kt */
        /* renamed from: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$onCreateView$1$2$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements c0<PagedList<NotificationMessagesResponse.NotificationMessage>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ NotificationMessagesFragment f32687a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: NotificationMessagesFragment.kt */
            /* renamed from: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$onCreateView$1$2$1$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0356a implements DataSource.c {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ NotificationMessagesFragment f32688a;

                C0356a(NotificationMessagesFragment notificationMessagesFragment) {
                    this.f32688a = notificationMessagesFragment;
                }

                @Override // androidx.paging.DataSource.c
                public final void a() {
                    this.f32688a.B().B0();
                }
            }

            a(NotificationMessagesFragment notificationMessagesFragment) {
                this.f32687a = notificationMessagesFragment;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(PagedList<NotificationMessagesResponse.NotificationMessage> pagedList) {
                c S;
                pagedList.s().addInvalidatedCallback(new C0356a(this.f32687a));
                S = this.f32687a.S();
                if (S != null) {
                    S.f(pagedList);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationMessagesFragment notificationMessagesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32686b = notificationMessagesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f32686b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f32685a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                NotificationMessagesViewModel B = this.f32686b.B();
                this.f32685a = 1;
                obj = B.z0(this);
                if (obj == f11) {
                    return f11;
                }
            }
            ((LiveData) obj).observe(this.f32686b.getViewLifecycleOwner(), new a(this.f32686b));
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationMessagesFragment$onCreateView$1$2(NotificationMessagesFragment notificationMessagesFragment, a<? super NotificationMessagesFragment$onCreateView$1$2> aVar) {
        super(2, aVar);
        this.f32684c = notificationMessagesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        NotificationMessagesFragment$onCreateView$1$2 notificationMessagesFragment$onCreateView$1$2 = new NotificationMessagesFragment$onCreateView$1$2(this.f32684c, aVar);
        notificationMessagesFragment$onCreateView$1$2.f32683b = obj;
        return notificationMessagesFragment$onCreateView$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f32682a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32684c, null);
            this.f32682a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f32683b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NotificationMessagesFragment$onCreateView$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
