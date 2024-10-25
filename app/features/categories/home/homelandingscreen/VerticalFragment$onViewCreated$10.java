package com.forsale.app.features.categories.home.homelandingscreen;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$10", f = "VerticalFragment.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$10 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23865a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23866b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$10$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$10$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23867a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f23868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23869c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23869c = verticalFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23869c, aVar);
            anonymousClass1.f23868b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23867a == 0) {
                f.b(obj);
                this.f23869c.v0(this.f23868b);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$10(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$10> aVar) {
        super(1, aVar);
        this.f23866b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$10(this.f23866b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23865a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Integer> u12 = this.f23866b.B().u1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23866b, null);
            this.f23865a = 1;
            if (FlowKt.collectLatest(u12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$10) create(aVar)).invokeSuspend(p.f75480a);
    }
}
