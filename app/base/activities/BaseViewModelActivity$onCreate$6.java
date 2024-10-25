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
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelActivity.kt */
@d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$6", f = "BaseViewModelActivity.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelActivity$onCreate$6 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22103a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelActivity<B, VM> f22104b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelActivity.kt */
    @d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$6$1", f = "BaseViewModelActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22105a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f22106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelActivity<B, VM> f22107c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22107c = baseViewModelActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22107c, aVar);
            anonymousClass1.f22106b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f22105a == 0) {
                f.b(obj);
                int i11 = this.f22106b;
                ComponentActivity componentActivity = this.f22107c;
                String string = componentActivity.getString(i11);
                o.h(string, "getString(...)");
                if (ContextExtensionsKt.f(componentActivity)) {
                    c.a aVar = new c.a(componentActivity);
                    aVar.o(y0.R4);
                    aVar.h(string);
                    aVar.m(componentActivity.getString(y0.Z4), new a());
                    aVar.d(false);
                    aVar.q();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }

        /* compiled from: ViewsExtensions.kt */
        /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$6$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelActivity$onCreate$6(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super BaseViewModelActivity$onCreate$6> aVar) {
        super(1, aVar);
        this.f22104b = baseViewModelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BaseViewModelActivity$onCreate$6(this.f22104b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22103a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Integer> K = this.f22104b.x0().K();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22104b, null);
            this.f22103a = 1;
            if (FlowKt.collectLatest(K, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BaseViewModelActivity$onCreate$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
