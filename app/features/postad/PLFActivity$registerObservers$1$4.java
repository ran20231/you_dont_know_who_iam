package com.forsale.app.features.postad;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PLFActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$registerObservers$1$4", f = "PLFActivity.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PLFActivity$registerObservers$1$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33887a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f33888b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PLFActivity f33889c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$registerObservers$1$4$1", f = "PLFActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PLFActivity$registerObservers$1$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33890a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PLFActivity f33891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PLFActivity pLFActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f33891b = pLFActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f33891b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f33890a == 0) {
                kotlin.f.b(obj);
                this.f33891b.j1();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFActivity$registerObservers$1$4(PostAdViewModel postAdViewModel, PLFActivity pLFActivity, zz.a<? super PLFActivity$registerObservers$1$4> aVar) {
        super(1, aVar);
        this.f33888b = postAdViewModel;
        this.f33889c = pLFActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PLFActivity$registerObservers$1$4(this.f33888b, this.f33889c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33887a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> R2 = this.f33888b.R2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33889c, null);
            this.f33887a = 1;
            if (FlowKt.collectLatest(R2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PLFActivity$registerObservers$1$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
