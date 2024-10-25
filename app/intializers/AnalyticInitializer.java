package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.adserver.utils.AnalyticsEvents;
import com.forsale.adserver.utils.InitAnalytics;
import com.forsale.analytics.AnalyticsType;
import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.requestsbodies.IncrementViewCounterBody;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.utils.analytics.AWSEventsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.AmplitudeLogger;
import com.forsale.app.utils.analytics.LeanPlumLogger;
import com.forsale.app.utils.analytics.d;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import dj.i;
import g00.l;
import g00.w;
import java.util.List;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import s9.a;
import wz.p;
/* compiled from: AnalyticInitializer.kt */
/* loaded from: classes2.dex */
public final class AnalyticInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public AggregatedAllAnalyticsLogger f37506a;

    /* renamed from: b  reason: collision with root package name */
    public AWSEventsLogger f37507b;

    /* renamed from: c  reason: collision with root package name */
    public AmplitudeLogger f37508c;

    /* renamed from: d  reason: collision with root package name */
    public LeanPlumLogger f37509d;

    /* renamed from: e  reason: collision with root package name */
    public d f37510e;

    /* renamed from: f  reason: collision with root package name */
    public CategoriesRepositories f37511f;

    /* renamed from: g  reason: collision with root package name */
    public AnalyticsService f37512g;

    /* renamed from: h  reason: collision with root package name */
    public ListingsService f37513h;

    /* renamed from: i  reason: collision with root package name */
    public CoroutineDispatcher f37514i;

    /* renamed from: j  reason: collision with root package name */
    public CoroutineScope f37515j;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
            i.f54287a.invoke().f(th2);
        }
    }

    private final void t() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(q().plus(new a(CoroutineExceptionHandler.Key))), null, null, new AnalyticInitializer$initAdServerAnalytics$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        InitAnalytics.f20835a.i(new w<String, Integer, Integer, Integer, Integer, String, Integer, String, String, p>() { // from class: com.forsale.app.intializers.AnalyticInitializer$registerAnalyticsListeners$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AnalyticInitializer.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.intializers.AnalyticInitializer$registerAnalyticsListeners$1$1", f = "AnalyticInitializer.kt", l = {205}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.intializers.AnalyticInitializer$registerAnalyticsListeners$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f37523a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnalyticInitializer f37524b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f37525c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ Integer f37526d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ String f37527e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ String f37528f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ Integer f37529g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AnalyticInitializer analyticInitializer, String str, Integer num, String str2, String str3, Integer num2, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f37524b = analyticInitializer;
                    this.f37525c = str;
                    this.f37526d = num;
                    this.f37527e = str2;
                    this.f37528f = str3;
                    this.f37529g = num2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f37524b, this.f37525c, this.f37526d, this.f37527e, this.f37528f, this.f37529g, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = b.f();
                    int i11 = this.f37523a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        AggregatedAllAnalyticsLogger m11 = this.f37524b.m();
                        String str = this.f37525c;
                        Integer num = this.f37526d;
                        String str2 = this.f37527e;
                        String str3 = this.f37528f;
                        Integer num2 = this.f37529g;
                        this.f37523a = 1;
                        if (AggregatedAllAnalyticsLoggerKt.o(m11, str, num, str2, str3, num2, this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(9);
            }

            public final void b(String event, Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, String str2, String str3) {
                boolean d11;
                boolean d12;
                boolean d13;
                boolean d14;
                boolean d15;
                o.i(event, "event");
                boolean z11 = true;
                if (o.d(event, AnalyticsEvents.SPLASH_ACTION_LIKED.getValue())) {
                    d11 = true;
                } else {
                    d11 = o.d(event, AnalyticsEvents.SPLASH_ACTION_URL_CLICKED.getValue());
                }
                if (d11) {
                    d12 = true;
                } else {
                    d12 = o.d(event, AnalyticsEvents.OFFER_ACTION_LIKED.getValue());
                }
                if (d12) {
                    d13 = true;
                } else {
                    d13 = o.d(event, AnalyticsEvents.OFFER_ACTION_URL_CLICKED.getValue());
                }
                if (d13) {
                    d14 = true;
                } else {
                    d14 = o.d(event, AnalyticsEvents.BANNER_ACTION_LIKED.getValue());
                }
                if (d14) {
                    d15 = true;
                } else {
                    d15 = o.d(event, AnalyticsEvents.BANNER_ACTION_URL_CLICKED.getValue());
                }
                if (!d15) {
                    z11 = o.d(event, AnalyticsEvents.BANNER_ACTION_VIDEO_UNMUTED.getValue());
                }
                if (z11) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AnalyticInitializer.this.q()), null, null, new AnonymousClass1(AnalyticInitializer.this, event, num3, str2, str3, num4, null), 3, null);
                }
            }

            @Override // g00.w
            public /* bridge */ /* synthetic */ p j(String str, Integer num, Integer num2, Integer num3, Integer num4, String str2, Integer num5, String str3, String str4) {
                b(str, num, num2, num3, num4, str2, num5, str3, str4);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        InitAnalytics.f20835a.j(new l<a.C0811a, p>() { // from class: com.forsale.app.intializers.AnalyticInitializer$registerCommercialAnlyticsListeners$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AnalyticInitializer.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.intializers.AnalyticInitializer$registerCommercialAnlyticsListeners$1$1", f = "AnalyticInitializer.kt", l = {162}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.intializers.AnalyticInitializer$registerCommercialAnlyticsListeners$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                Object f37531a;

                /* renamed from: b  reason: collision with root package name */
                int f37532b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a.C0811a f37533c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ AnalyticInitializer f37534d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(a.C0811a c0811a, AnalyticInitializer analyticInitializer, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f37533c = c0811a;
                    this.f37534d = analyticInitializer;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f37533c, this.f37534d, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    Map n11;
                    Map map;
                    List n12;
                    List list;
                    Map n13;
                    f11 = b.f();
                    int i11 = this.f37532b;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            map = (Map) this.f37531a;
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        n11 = j0.n(this.f37533c.a(), this.f37534d.m().Z());
                        Integer f12 = this.f37533c.f();
                        if (f12 != null) {
                            AnalyticInitializer analyticInitializer = this.f37534d;
                            int intValue = f12.intValue();
                            AggregatedAllAnalyticsLogger m11 = analyticInitializer.m();
                            this.f37531a = n11;
                            this.f37532b = 1;
                            Object T = m11.T(intValue, this);
                            if (T == f11) {
                                return f11;
                            }
                            map = n11;
                            obj = T;
                        }
                        n12 = r.n();
                        List list2 = n12;
                        map = n11;
                        list = list2;
                        n13 = j0.n(map, list);
                        AggregatedAllAnalyticsLogger.h(this.f37534d.m(), this.f37533c.e(), n13, null, null, null, this.f37533c.c(), this.f37533c.d(), this.f37533c.b(), false, 284, null);
                        return p.f75480a;
                    }
                    List list3 = (List) obj;
                    if (list3 != null) {
                        list = list3;
                        n13 = j0.n(map, list);
                        AggregatedAllAnalyticsLogger.h(this.f37534d.m(), this.f37533c.e(), n13, null, null, null, this.f37533c.c(), this.f37533c.d(), this.f37533c.b(), false, 284, null);
                        return p.f75480a;
                    }
                    n11 = map;
                    n12 = r.n();
                    List list22 = n12;
                    map = n11;
                    list = list22;
                    n13 = j0.n(map, list);
                    AggregatedAllAnalyticsLogger.h(this.f37534d.m(), this.f37533c.e(), n13, null, null, null, this.f37533c.c(), this.f37533c.d(), this.f37533c.b(), false, 284, null);
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(a.C0811a it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AnalyticInitializer.this.q()), null, null, new AnonymousClass1(it2, AnalyticInitializer.this, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(a.C0811a c0811a) {
                b(c0811a);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        InitAnalytics.f20835a.l(new l<a.b, p>() { // from class: com.forsale.app.intializers.AnalyticInitializer$registerCommercialPinAnalyticsListeners$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AnalyticInitializer.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.intializers.AnalyticInitializer$registerCommercialPinAnalyticsListeners$1$1", f = "AnalyticInitializer.kt", l = {136, 139}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.intializers.AnalyticInitializer$registerCommercialPinAnalyticsListeners$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                Object f37536a;

                /* renamed from: b  reason: collision with root package name */
                int f37537b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a.b f37538c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ AnalyticInitializer f37539d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(a.b bVar, AnalyticInitializer analyticInitializer, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f37538c = bVar;
                    this.f37539d = analyticInitializer;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f37538c, this.f37539d, aVar);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                    /*
                        r14 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                        int r1 = r14.f37537b
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L27
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r0 = r14.f37536a
                        java.util.Map r0 = (java.util.Map) r0
                        kotlin.f.b(r15)
                        goto L8d
                    L17:
                        java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r15.<init>(r0)
                        throw r15
                    L1f:
                        java.lang.Object r1 = r14.f37536a
                        java.util.Map r1 = (java.util.Map) r1
                        kotlin.f.b(r15)
                        goto L5d
                    L27:
                        kotlin.f.b(r15)
                        s9.a$b r15 = r14.f37538c
                        java.util.Map r15 = r15.a()
                        com.forsale.app.intializers.AnalyticInitializer r1 = r14.f37539d
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r1 = r1.m()
                        java.util.List r1 = r1.Z()
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.util.Map r1 = kotlin.collections.g0.n(r15, r1)
                        s9.a$b r15 = r14.f37538c
                        java.lang.Integer r15 = r15.f()
                        if (r15 == 0) goto L64
                        com.forsale.app.intializers.AnalyticInitializer r4 = r14.f37539d
                        int r15 = r15.intValue()
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r4 = r4.m()
                        r14.f37536a = r1
                        r14.f37537b = r3
                        java.lang.Object r15 = r4.s(r15, r14)
                        if (r15 != r0) goto L5d
                        return r0
                    L5d:
                        java.util.List r15 = (java.util.List) r15
                        if (r15 == 0) goto L64
                        java.lang.Iterable r15 = (java.lang.Iterable) r15
                        goto L6a
                    L64:
                        java.util.List r15 = kotlin.collections.p.n()
                        java.lang.Iterable r15 = (java.lang.Iterable) r15
                    L6a:
                        java.util.Map r15 = kotlin.collections.g0.n(r1, r15)
                        s9.a$b r1 = r14.f37538c
                        java.lang.Integer r1 = r1.g()
                        if (r1 == 0) goto L95
                        com.forsale.app.intializers.AnalyticInitializer r3 = r14.f37539d
                        int r1 = r1.intValue()
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r3 = r3.m()
                        r14.f37536a = r15
                        r14.f37537b = r2
                        java.lang.Object r1 = r3.T(r1, r14)
                        if (r1 != r0) goto L8b
                        return r0
                    L8b:
                        r0 = r15
                        r15 = r1
                    L8d:
                        java.util.List r15 = (java.util.List) r15
                        if (r15 == 0) goto L94
                        java.lang.Iterable r15 = (java.lang.Iterable) r15
                        goto L9e
                    L94:
                        r15 = r0
                    L95:
                        java.util.List r0 = kotlin.collections.p.n()
                        java.lang.Iterable r0 = (java.lang.Iterable) r0
                        r13 = r0
                        r0 = r15
                        r15 = r13
                    L9e:
                        java.util.Map r3 = kotlin.collections.g0.n(r0, r15)
                        com.forsale.app.intializers.AnalyticInitializer r15 = r14.f37539d
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r1 = r15.m()
                        s9.a$b r15 = r14.f37538c
                        java.lang.String r2 = r15.e()
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        s9.a$b r15 = r14.f37538c
                        boolean r7 = r15.c()
                        s9.a$b r15 = r14.f37538c
                        boolean r8 = r15.d()
                        s9.a$b r15 = r14.f37538c
                        boolean r9 = r15.b()
                        r10 = 0
                        r11 = 284(0x11c, float:3.98E-43)
                        r12 = 0
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        wz.p r15 = wz.p.f75480a
                        return r15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.intializers.AnalyticInitializer$registerCommercialPinAnalyticsListeners$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(a.b it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AnalyticInitializer.this.q()), null, null, new AnonymousClass1(it2, AnalyticInitializer.this, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(a.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        InitAnalytics.f20835a.o(new g00.p<String, AnalyticsType, p>() { // from class: com.forsale.app.intializers.AnalyticInitializer$registerIncrementCommercialPinClicksListener$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AnalyticInitializer.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.intializers.AnalyticInitializer$registerIncrementCommercialPinClicksListener$1$1", f = "AnalyticInitializer.kt", l = {117}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.intializers.AnalyticInitializer$registerIncrementCommercialPinClicksListener$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f37541a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnalyticInitializer f37542b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f37543c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ AnalyticsType f37544d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AnalyticInitializer analyticInitializer, String str, AnalyticsType analyticsType, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f37542b = analyticInitializer;
                    this.f37543c = str;
                    this.f37544d = analyticsType;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f37542b, this.f37543c, this.f37544d, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = b.f();
                    int i11 = this.f37541a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        AnalyticsService l11 = this.f37542b.l();
                        IncrementCallClicksBody incrementCallClicksBody = new IncrementCallClicksBody(this.f37543c, this.f37544d);
                        this.f37541a = 1;
                        if (l11.incrementCallClicks(incrementCallClicksBody, this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String id2, AnalyticsType target) {
                o.i(id2, "id");
                o.i(target, "target");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AnalyticInitializer.this.q()), null, null, new AnonymousClass1(AnalyticInitializer.this, id2, target, null), 3, null);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str, AnalyticsType analyticsType) {
                b(str, analyticsType);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        InitAnalytics.f20835a.p(new l<String, p>() { // from class: com.forsale.app.intializers.AnalyticInitializer$registerIncrementCommercialPinViewsCountListener$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AnalyticInitializer.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.intializers.AnalyticInitializer$registerIncrementCommercialPinViewsCountListener$1$1", f = "AnalyticInitializer.kt", l = {FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.intializers.AnalyticInitializer$registerIncrementCommercialPinViewsCountListener$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f37546a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ AnalyticInitializer f37547b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f37548c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AnalyticInitializer analyticInitializer, String str, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f37547b = analyticInitializer;
                    this.f37548c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f37547b, this.f37548c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    f11 = b.f();
                    int i11 = this.f37546a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        ListingsService s11 = this.f37547b.s();
                        IncrementViewCounterBody incrementViewCounterBody = new IncrementViewCounterBody(this.f37548c);
                        this.f37546a = 1;
                        if (s11.incrementViewCounter(incrementViewCounterBody, this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String id2) {
                o.i(id2, "id");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AnalyticInitializer.this.q()), null, null, new AnonymousClass1(AnalyticInitializer.this, id2, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        InitAnalytics.f20835a.r(new AnalyticInitializer$registerVerticalNamesListeners$1(this, null));
    }

    @Override // o4.a
    public List<Class<? extends o4.a<?>>> a() {
        List<Class<? extends o4.a<?>>> e11;
        e11 = q.e(AdServerInitializer.class);
        return e11;
    }

    @Override // o4.a
    public /* bridge */ /* synthetic */ p b(Context context) {
        i(context);
        return p.f75480a;
    }

    public void i(Context context) {
        Trace e11 = e.e("appStart_initializer_analytics");
        o.i(context, "context");
        com.forsale.app.intializers.a.f37573b.a(context).q(this);
        t();
        n().f();
        k().m();
        r().m();
        BuildersKt__Builders_commonKt.launch$default(p(), null, null, new AnalyticInitializer$create$1(context, null), 3, null);
        j().g();
        e11.stop();
    }

    public final d j() {
        d dVar = this.f37510e;
        if (dVar != null) {
            return dVar;
        }
        o.w("adjustLogger");
        return null;
    }

    public final AmplitudeLogger k() {
        AmplitudeLogger amplitudeLogger = this.f37508c;
        if (amplitudeLogger != null) {
            return amplitudeLogger;
        }
        o.w("amplitudeLogger");
        return null;
    }

    public final AnalyticsService l() {
        AnalyticsService analyticsService = this.f37512g;
        if (analyticsService != null) {
            return analyticsService;
        }
        o.w("analysisService");
        return null;
    }

    public final AggregatedAllAnalyticsLogger m() {
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f37506a;
        if (aggregatedAllAnalyticsLogger != null) {
            return aggregatedAllAnalyticsLogger;
        }
        o.w("analyticsLogger");
        return null;
    }

    public final AWSEventsLogger n() {
        AWSEventsLogger aWSEventsLogger = this.f37507b;
        if (aWSEventsLogger != null) {
            return aWSEventsLogger;
        }
        o.w("awsEventsLogger");
        return null;
    }

    public final CategoriesRepositories o() {
        CategoriesRepositories categoriesRepositories = this.f37511f;
        if (categoriesRepositories != null) {
            return categoriesRepositories;
        }
        o.w("categoriesRepositories");
        return null;
    }

    public final CoroutineScope p() {
        CoroutineScope coroutineScope = this.f37515j;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        o.w("coroutineScope");
        return null;
    }

    public final CoroutineDispatcher q() {
        CoroutineDispatcher coroutineDispatcher = this.f37514i;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        o.w("ioDispatcher");
        return null;
    }

    public final LeanPlumLogger r() {
        LeanPlumLogger leanPlumLogger = this.f37509d;
        if (leanPlumLogger != null) {
            return leanPlumLogger;
        }
        o.w("leanPlumLogger");
        return null;
    }

    public final ListingsService s() {
        ListingsService listingsService = this.f37513h;
        if (listingsService != null) {
            return listingsService;
        }
        o.w("listingsService");
        return null;
    }
}
