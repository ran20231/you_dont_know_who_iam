package com.forsale.app.base.fragments;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelFragment.kt */
@d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$8", f = "BaseViewModelFragment.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelFragment$onCreateView$8 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22191a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelFragment<B, VM> f22192b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelFragment.kt */
    @d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$8$1", f = "BaseViewModelFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$8$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22193a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f22194b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelFragment<B, VM> f22195c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22195c = baseViewModelFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22195c, aVar);
            anonymousClass1.f22194b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f22193a == 0) {
                f.b(obj);
                int i11 = this.f22194b;
                Context context = this.f22195c.getContext();
                if (context != null) {
                    String string = this.f22195c.getString(i11);
                    o.h(string, "getString(...)");
                    if (ContextExtensionsKt.f(context)) {
                        c.a aVar = new c.a(context);
                        aVar.o(y0.M4);
                        aVar.h(string);
                        aVar.m(context.getString(y0.Z4), new a());
                        aVar.d(false);
                        aVar.q();
                    }
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
        /* renamed from: com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$8$1$a */
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
    public BaseViewModelFragment$onCreateView$8(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super BaseViewModelFragment$onCreateView$8> aVar) {
        super(1, aVar);
        this.f22192b = baseViewModelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new BaseViewModelFragment$onCreateView$8(this.f22192b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22191a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Integer> t11 = this.f22192b.B().t();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22192b, null);
            this.f22191a = 1;
            if (FlowKt.collectLatest(t11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((BaseViewModelFragment$onCreateView$8) create(aVar)).invokeSuspend(p.f75480a);
    }
}
