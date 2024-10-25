package com.forsale.app.features.postad;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.forsale.app.datalayer.database.UserEntity;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PLFActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$registerObservers$1$1", f = "PLFActivity.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PLFActivity$registerObservers$1$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33879a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PLFActivity f33880b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<UserEntity> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PLFActivity f33881a;

        a(PLFActivity pLFActivity) {
            this.f33881a = pLFActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(UserEntity userEntity, zz.a<? super p> aVar) {
            this.f33881a.f1();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFActivity$registerObservers$1$1(PLFActivity pLFActivity, zz.a<? super PLFActivity$registerObservers$1$1> aVar) {
        super(1, aVar);
        this.f33880b = pLFActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PLFActivity$registerObservers$1$1(this.f33880b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33879a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            StateFlow<UserEntity> a32 = this.f33880b.x0().a3();
            if (a32 != null) {
                Lifecycle lifecycle = this.f33880b.getLifecycle();
                o.h(lifecycle, "<get-lifecycle>(...)");
                Flow a11 = FlowExtKt.a(a32, lifecycle, Lifecycle.State.RESUMED);
                if (a11 != null) {
                    a aVar = new a(this.f33880b);
                    this.f33879a = 1;
                    if (a11.collect(aVar, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PLFActivity$registerObservers$1$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
