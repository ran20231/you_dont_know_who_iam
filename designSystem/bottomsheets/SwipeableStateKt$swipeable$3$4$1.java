package com.forsale.designSystem.bottomsheets;

import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
import zz.a;
/* compiled from: SwipeableState.kt */
@d(c = "com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable$3$4$1", f = "SwipeableState.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SwipeableStateKt$swipeable$3$4$1 extends SuspendLambda implements q<CoroutineScope, Float, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40985a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40986b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ float f40987c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f40988d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g00.a<p> f40989e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeableState.kt */
    @d(c = "com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable$3$4$1$1", f = "SwipeableState.kt", l = {591}, m = "invokeSuspend")
    /* renamed from: com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable$3$4$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SwipeableState<T> f40991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f40992c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g00.a<p> f40993d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwipeableState<T> swipeableState, float f11, g00.a<p> aVar, a<? super AnonymousClass1> aVar2) {
            super(2, aVar2);
            this.f40991b = swipeableState;
            this.f40992c = f11;
            this.f40993d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f40991b, this.f40992c, this.f40993d, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f40990a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SwipeableState<T> swipeableState = this.f40991b;
                float f12 = this.f40992c;
                g00.a<p> aVar = this.f40993d;
                this.f40990a = 1;
                if (swipeableState.z(f12, aVar, this) == f11) {
                    return f11;
                }
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableStateKt$swipeable$3$4$1(SwipeableState<T> swipeableState, g00.a<p> aVar, a<? super SwipeableStateKt$swipeable$3$4$1> aVar2) {
        super(3, aVar2);
        this.f40988d = swipeableState;
        this.f40989e = aVar;
    }

    public final Object b(CoroutineScope coroutineScope, float f11, a<? super p> aVar) {
        SwipeableStateKt$swipeable$3$4$1 swipeableStateKt$swipeable$3$4$1 = new SwipeableStateKt$swipeable$3$4$1(this.f40988d, this.f40989e, aVar);
        swipeableStateKt$swipeable$3$4$1.f40986b = coroutineScope;
        swipeableStateKt$swipeable$3$4$1.f40987c = f11;
        return swipeableStateKt$swipeable$3$4$1.invokeSuspend(p.f75480a);
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f11, a<? super p> aVar) {
        return b(coroutineScope, f11.floatValue(), aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f40985a == 0) {
            f.b(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f40986b, null, null, new AnonymousClass1(this.f40988d, this.f40987c, this.f40989e, null), 3, null);
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
