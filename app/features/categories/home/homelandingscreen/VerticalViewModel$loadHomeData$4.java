package com.forsale.app.features.categories.home.homelandingscreen;

import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHomeData$4", f = "VerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadHomeData$4 extends SuspendLambda implements p<VerticalViewModel, zz.a<? super Job>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23999a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24000b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHomeData$4$1", f = "VerticalViewModel.kt", l = {337}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHomeData$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerticalViewModel f24002b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalViewModel verticalViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24002b = verticalViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f24002b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableSharedFlow mutableSharedFlow;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f24001a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                mutableSharedFlow = this.f24002b.L0;
                wz.p pVar = wz.p.f75480a;
                this.f24001a = 1;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadHomeData$4(VerticalViewModel verticalViewModel, zz.a<? super VerticalViewModel$loadHomeData$4> aVar) {
        super(2, aVar);
        this.f24000b = verticalViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(VerticalViewModel verticalViewModel, zz.a<? super Job> aVar) {
        return ((VerticalViewModel$loadHomeData$4) create(verticalViewModel, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$loadHomeData$4(this.f24000b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f23999a == 0) {
            f.b(obj);
            this.f24000b.v0().setValue(ViewStates.CONTENT);
            this.f24000b.t1().c(wz.p.f75480a);
            launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this.f24000b), null, null, new AnonymousClass1(this.f24000b, null), 3, null);
            return launch$default;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
