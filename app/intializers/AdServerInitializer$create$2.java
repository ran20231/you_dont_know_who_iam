package com.forsale.app.intializers;

import android.app.Application;
import android.content.Context;
import com.forsale.app.App;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: AdServerInitializer.kt */
@d(c = "com.forsale.app.intializers.AdServerInitializer$create$2", f = "AdServerInitializer.kt", l = {43, 49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AdServerInitializer$create$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f37497a;

    /* renamed from: b  reason: collision with root package name */
    Object f37498b;

    /* renamed from: c  reason: collision with root package name */
    Object f37499c;

    /* renamed from: d  reason: collision with root package name */
    int f37500d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f37501e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AdServerInitializer f37502f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f37503g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdServerInitializer.kt */
    @d(c = "com.forsale.app.intializers.AdServerInitializer$create$2$1", f = "AdServerInitializer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.intializers.AdServerInitializer$create$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<String, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37504a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f37505b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
            anonymousClass1.f37505b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f37504a == 0) {
                f.b(obj);
                j9.d.a((String) this.f37505b);
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdServerInitializer$create$2(Context context, AdServerInitializer adServerInitializer, String str, zz.a<? super AdServerInitializer$create$2> aVar) {
        super(2, aVar);
        this.f37501e = context;
        this.f37502f = adServerInitializer;
        this.f37503g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AdServerInitializer$create$2(this.f37501e, this.f37502f, this.f37503g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        String str;
        l8.b bVar;
        App app;
        f11 = b.f();
        int i11 = this.f37500d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            str = (String) this.f37499c;
            bVar = (l8.b) this.f37497a;
            app = (Application) this.f37498b;
        } else {
            f.b(obj);
            l8.b bVar2 = l8.b.f62269a;
            Context context = this.f37501e;
            o.g(context, "null cannot be cast to non-null type com.forsale.app.App");
            App app2 = (App) context;
            String k11 = LocaleManager.f39597a.k();
            kj.b c11 = this.f37502f.e().c();
            this.f37497a = bVar2;
            this.f37498b = app2;
            this.f37499c = k11;
            this.f37500d = 1;
            Object a11 = c11.a(this);
            if (a11 == f11) {
                return f11;
            }
            str = k11;
            bVar = bVar2;
            app = app2;
            obj = a11;
        }
        bVar.c(app, str, (String) obj, "com.forsale.forsale", "28.3.1", this.f37503g, true);
        StateFlow<String> m11 = LocaleManager.f39597a.m();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        this.f37497a = null;
        this.f37498b = null;
        this.f37499c = null;
        this.f37500d = 2;
        if (FlowKt.collectLatest(m11, anonymousClass1, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AdServerInitializer$create$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
