package com.forsale.app.features.more.support;

import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportActivity$registerObservers$6", f = "SupportActivity.kt", l = {65}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SupportActivity$registerObservers$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32817a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SupportActivity f32818b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SupportActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportActivity$registerObservers$6$1", f = "SupportActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.support.SupportActivity$registerObservers$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<String, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32819a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f32820b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SupportActivity f32821c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SupportActivity supportActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32821c = supportActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32821c, aVar);
            anonymousClass1.f32820b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f32819a == 0) {
                f.b(obj);
                String str = (String) this.f32820b;
                if (str != null) {
                    SupportActivity supportActivity = this.f32821c;
                    WebActivity.a aVar = WebActivity.I;
                    WebType webType = WebType.WALKTHROUGHT;
                    String string = supportActivity.getString(y0.f70472ga);
                    o.h(string, "getString(...)");
                    WebActivity.a.d(aVar, supportActivity, webType, string, str, 0, null, 24, null);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportActivity$registerObservers$6(SupportActivity supportActivity, zz.a<? super SupportActivity$registerObservers$6> aVar) {
        super(1, aVar);
        this.f32818b = supportActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SupportActivity$registerObservers$6(this.f32818b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32817a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<String> N0 = this.f32818b.x0().N0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32818b, null);
            this.f32817a = 1;
            if (FlowKt.collectLatest(N0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SupportActivity$registerObservers$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
