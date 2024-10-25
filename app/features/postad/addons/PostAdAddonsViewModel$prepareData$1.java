package com.forsale.app.features.postad.addons;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.PostAdAddonsViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.google.logging.type.LogSeverity;
import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1", f = "PostAdAddonsViewModel.kt", l = {184, 185, LogSeverity.INFO_VALUE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$prepareData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34356a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f34357b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34358c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsViewModel.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1$1", f = "PostAdAddonsViewModel.kt", l = {183}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsViewModel f34360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34360b = postAdAddonsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34360b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            Object V0;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34359a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                PostAdAddonsViewModel postAdAddonsViewModel = this.f34360b;
                this.f34359a = 1;
                V0 = postAdAddonsViewModel.V0(this);
                if (V0 == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsViewModel.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1$2", f = "PostAdAddonsViewModel.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_MASK}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34361a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f34362b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsViewModel f34363c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsViewModel.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1$2$1", f = "PostAdAddonsViewModel.kt", l = {191}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$prepareData$1$2$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34364a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsViewModel f34365b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super AnonymousClass1> aVar) {
                super(2, aVar);
                this.f34365b = postAdAddonsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new AnonymousClass1(this.f34365b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object f11;
                Object W0;
                f11 = kotlin.coroutines.intrinsics.b.f();
                int i11 = this.f34364a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        f.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    f.b(obj);
                    PostAdAddonsViewModel postAdAddonsViewModel = this.f34365b;
                    this.f34364a = 1;
                    W0 = postAdAddonsViewModel.W0(this);
                    if (W0 == f11) {
                        return f11;
                    }
                }
                return wz.p.f75480a;
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f34363c = postAdAddonsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f34363c, aVar);
            anonymousClass2.f34362b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            Deferred async$default;
            ListingDetailsEntity listingDetailsEntity;
            List<Addon> h12;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34361a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f34362b;
                if (this.f34363c.e1().H4()) {
                    this.f34363c.n1(PostAdAddonsViewModel.AddonsState.WAITING_APPROVAL);
                } else {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.f34363c, null), 3, null);
                    this.f34361a = 1;
                    if (async$default.await(this) == f11) {
                        return f11;
                    }
                }
            }
            x10.a.b("XXX: prepareData", new Object[0]);
            PostAdViewModel e12 = this.f34363c.e1();
            listingDetailsEntity = this.f34363c.f34325r0;
            h12 = this.f34363c.h1();
            e12.D4(listingDetailsEntity, h12);
            PostAdAddonsViewModel postAdAddonsViewModel = this.f34363c;
            postAdAddonsViewModel.p1(postAdAddonsViewModel.e1().k2());
            this.f34363c.e1().B1();
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$prepareData$1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super PostAdAddonsViewModel$prepareData$1> aVar) {
        super(2, aVar);
        this.f34358c = postAdAddonsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdAddonsViewModel$prepareData$1 postAdAddonsViewModel$prepareData$1 = new PostAdAddonsViewModel$prepareData$1(this.f34358c, aVar);
        postAdAddonsViewModel$prepareData$1.f34357b = obj;
        return postAdAddonsViewModel$prepareData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Throwable th2;
        Deferred async$default;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34356a;
        try {
        } catch (Throwable th3) {
            AggregatedAllAnalyticsLogger r11 = this.f34358c.r();
            String value = AggregatedAllAnalyticsLogger.CustomParameterName.ADDONS_PAGE.getValue();
            String message = th3.getMessage();
            this.f34357b = th3;
            this.f34356a = 3;
            if (AggregatedAllAnalyticsLoggerKt.O(r11, value, message, null, this, 4, null) == f11) {
                return f11;
            }
            th2 = th3;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        th2 = (Throwable) this.f34357b;
                        f.b(obj);
                        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                            this.f34358c.n1(PostAdAddonsViewModel.AddonsState.CONNECTION_ERROR);
                        } else {
                            this.f34358c.n1(PostAdAddonsViewModel.AddonsState.ERROR);
                        }
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return wz.p.f75480a;
            }
            f.b(obj);
        } else {
            f.b(obj);
            async$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.f34357b, null, null, new AnonymousClass1(this.f34358c, null), 3, null);
            this.f34356a = 1;
            if (async$default.await(this) == f11) {
                return f11;
            }
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f34358c, null);
        this.f34356a = 2;
        if (BuildersKt.withContext(main, anonymousClass2, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$prepareData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
