package com.forsale.app.base.activities;

import android.content.DialogInterface;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.c;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelActivity.kt */
@d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$3", f = "BaseViewModelActivity.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelActivity$onCreate$3 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22088a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelActivity<B, VM> f22089b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelActivity$onCreate$3(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super BaseViewModelActivity$onCreate$3> aVar) {
        super(1, aVar);
        this.f22089b = baseViewModelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BaseViewModelActivity$onCreate$3(this.f22089b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22088a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<String> N = this.f22089b.x0().N();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22089b, null);
            this.f22088a = 1;
            if (FlowKt.collectLatest(N, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BaseViewModelActivity$onCreate$3) create(aVar)).invokeSuspend(p.f75480a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelActivity.kt */
    @d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$3$1", f = "BaseViewModelActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<String, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22090a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f22091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelActivity<B, VM> f22092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22092c = baseViewModelActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22092c, aVar);
            anonymousClass1.f22091b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f22090a == 0) {
                f.b(obj);
                String str = (String) this.f22091b;
                if (str != null) {
                    ComponentActivity componentActivity = this.f22092c;
                    if (ContextExtensionsKt.f(componentActivity)) {
                        c.a aVar = new c.a(componentActivity);
                        aVar.o(y0.M4);
                        aVar.h(str);
                        aVar.m(componentActivity.getString(y0.Z4), new a());
                        aVar.d(false);
                        aVar.q();
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ViewsExtensions.kt */
        /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$3$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
