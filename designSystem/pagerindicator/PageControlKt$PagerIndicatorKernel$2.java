package com.forsale.designSystem.pagerindicator;

import androidx.compose.runtime.z;
import g00.p;
import j0.k0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PageControl.kt */
@d(c = "com.forsale.designSystem.pagerindicator.PageControlKt$PagerIndicatorKernel$2", f = "PageControl.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PageControlKt$PagerIndicatorKernel$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42026a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42027b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bk.a f42028c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f42029d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42030e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k0<RangeChanged> f42031f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageControl.kt */
    /* renamed from: com.forsale.designSystem.pagerindicator.PageControlKt$PagerIndicatorKernel$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g00.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f42032a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(int i11) {
            super(0);
            this.f42032a = i11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // g00.a
        public final Integer invoke() {
            return Integer.valueOf(this.f42032a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PageControl.kt */
    /* loaded from: classes3.dex */
    public static final class a implements FlowCollector<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ bk.a f42033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0<Integer> f42034b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42035c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k0<RangeChanged> f42036d;

        a(bk.a aVar, k0<Integer> k0Var, int i11, k0<RangeChanged> k0Var2) {
            this.f42033a = aVar;
            this.f42034b = k0Var;
            this.f42035c = i11;
            this.f42036d = k0Var2;
        }

        public final Object a(int i11, zz.a<? super wz.p> aVar) {
            this.f42033a.l(i11);
            PageControlKt.d(this.f42034b, i11);
            PageControlKt.g(this.f42035c, this.f42036d, i11);
            return wz.p.f75480a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Integer num, zz.a aVar) {
            return a(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControlKt$PagerIndicatorKernel$2(int i11, bk.a aVar, k0<Integer> k0Var, int i12, k0<RangeChanged> k0Var2, zz.a<? super PageControlKt$PagerIndicatorKernel$2> aVar2) {
        super(2, aVar2);
        this.f42027b = i11;
        this.f42028c = aVar;
        this.f42029d = k0Var;
        this.f42030e = i12;
        this.f42031f = k0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PageControlKt$PagerIndicatorKernel$2(this.f42027b, this.f42028c, this.f42029d, this.f42030e, this.f42031f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f42026a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            Flow p11 = z.p(new AnonymousClass1(this.f42027b));
            a aVar = new a(this.f42028c, this.f42029d, this.f42030e, this.f42031f);
            this.f42026a = 1;
            if (p11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PageControlKt$PagerIndicatorKernel$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
