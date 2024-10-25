package com.forsale.app.base.activities;

import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelActivity.kt */
@d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$5", f = "BaseViewModelActivity.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelActivity$onCreate$5 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22098a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelActivity<B, VM> f22099b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelActivity.kt */
    @d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$5$1", f = "BaseViewModelActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<String, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22100a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f22101b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelActivity<B, VM> f22102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22102c = baseViewModelActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, a<? super p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22102c, aVar);
            anonymousClass1.f22101b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f22100a == 0) {
                f.b(obj);
                String str = (String) this.f22101b;
                if (str != null) {
                    this.f22102c.q0(str);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelActivity$onCreate$5(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super BaseViewModelActivity$onCreate$5> aVar) {
        super(1, aVar);
        this.f22099b = baseViewModelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BaseViewModelActivity$onCreate$5(this.f22099b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22098a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<String> O = this.f22099b.x0().O();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22099b, null);
            this.f22098a = 1;
            if (FlowKt.collectLatest(O, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BaseViewModelActivity$onCreate$5) create(aVar)).invokeSuspend(p.f75480a);
    }
}
