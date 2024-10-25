package com.forsale.app.features.maincontainer;

import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$5", f = "MainContainerActivity.kt", l = {654}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$initializeObserver$5 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31379a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$initializeObserver$5(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$initializeObserver$5> aVar) {
        super(1, aVar);
        this.f31380b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MainContainerActivity$initializeObserver$5(this.f31380b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31379a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> X0 = this.f31380b.x0().X0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31380b, null);
            this.f31379a = 1;
            if (FlowKt.collectLatest(X0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MainContainerActivity$initializeObserver$5) create(aVar)).invokeSuspend(p.f75480a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainContainerActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$5$1", f = "MainContainerActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MainContainerActivity f31382b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MainContainerActivity mainContainerActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31382b = mainContainerActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f31382b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f31381a == 0) {
                kotlin.f.b(obj);
                MainContainerActivity mainContainerActivity = this.f31382b;
                String string = mainContainerActivity.getString(y0.O5);
                o.h(string, "getString(...)");
                if (ContextExtensionsKt.f(mainContainerActivity)) {
                    c.a aVar = new c.a(mainContainerActivity);
                    aVar.o(y0.R4);
                    aVar.h(string);
                    aVar.m(mainContainerActivity.getString(y0.Z4), new a());
                    aVar.d(false);
                    aVar.q();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: ViewsExtensions.kt */
        /* renamed from: com.forsale.app.features.maincontainer.MainContainerActivity$initializeObserver$5$1$a */
        /* loaded from: classes2.dex */
        public static final class a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
