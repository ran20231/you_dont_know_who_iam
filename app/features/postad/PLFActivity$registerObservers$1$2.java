package com.forsale.app.features.postad;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PLFActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$registerObservers$1$2", f = "PLFActivity.kt", l = {195}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PLFActivity$registerObservers$1$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33882a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f33883b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PLFActivity f33884c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$registerObservers$1$2$1", f = "PLFActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PLFActivity$registerObservers$1$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PLFActivity f33886b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PLFActivity pLFActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f33886b = pLFActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f33886b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f33885a == 0) {
                kotlin.f.b(obj);
                this.f33886b.onSupportNavigateUp();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFActivity$registerObservers$1$2(PostAdViewModel postAdViewModel, PLFActivity pLFActivity, zz.a<? super PLFActivity$registerObservers$1$2> aVar) {
        super(1, aVar);
        this.f33883b = postAdViewModel;
        this.f33884c = pLFActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PLFActivity$registerObservers$1$2(this.f33883b, this.f33884c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33882a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> I2 = this.f33883b.I2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33884c, null);
            this.f33882a = 1;
            if (FlowKt.collectLatest(I2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PLFActivity$registerObservers$1$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
