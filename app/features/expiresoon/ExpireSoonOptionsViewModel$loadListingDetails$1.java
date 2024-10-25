package com.forsale.app.features.expiresoon;

import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsViewModel.kt */
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$loadListingDetails$1", f = "ExpireSoonOptionsViewModel.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsViewModel$loadListingDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31283a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsViewModel f31284b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonOptionsViewModel.kt */
    @d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$loadListingDetails$1$1", f = "ExpireSoonOptionsViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$loadListingDetails$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31285a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExpireSoonOptionsViewModel f31286b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExpireSoonOptionsViewModel expireSoonOptionsViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31286b = expireSoonOptionsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f31286b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f31285a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                this.f31286b.S0(ViewStates.LOADING);
                ExpireSoonRepository v11 = this.f31286b.v();
                this.f31285a = 1;
                if (v11.loadListingDetails(this) == f11) {
                    return f11;
                }
            }
            this.f31286b.S0(ViewStates.CONTENT);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsViewModel$loadListingDetails$1(ExpireSoonOptionsViewModel expireSoonOptionsViewModel, zz.a<? super ExpireSoonOptionsViewModel$loadListingDetails$1> aVar) {
        super(2, aVar);
        this.f31284b = expireSoonOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonOptionsViewModel$loadListingDetails$1(this.f31284b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f31283a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31284b, null);
            this.f31283a = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonOptionsViewModel$loadListingDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
