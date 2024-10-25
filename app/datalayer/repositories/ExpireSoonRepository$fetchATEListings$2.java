package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.requestsbodies.AboutToExpireRequestBody;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.datalayer.network.services.MyListingsService;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$fetchATEListings$2", f = "ExpireSoonRepository.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonRepository$fetchATEListings$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends AboutToExpireListing>>, Object> {
    int label;
    final /* synthetic */ ExpireSoonRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExpireSoonRepository.kt */
    @d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$fetchATEListings$2$1", f = "ExpireSoonRepository.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.datalayer.repositories.ExpireSoonRepository$fetchATEListings$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends AboutToExpireListing>>, Object> {
        int label;
        final /* synthetic */ ExpireSoonRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ExpireSoonRepository expireSoonRepository, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.this$0 = expireSoonRepository;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.this$0, aVar);
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends AboutToExpireListing>> aVar) {
            return invoke2(coroutineScope, (zz.a<? super List<AboutToExpireListing>>) aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MyListingsService myListingsService;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                myListingsService = this.this$0.myListingsService;
                AboutToExpireRequestBody aboutToExpireRequestBody = new AboutToExpireRequestBody(0, null, 3, null);
                this.label = 1;
                obj = myListingsService.getAboutToExpireListings(aboutToExpireRequestBody, this);
                if (obj == f11) {
                    return f11;
                }
            }
            return obj;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<AboutToExpireListing>> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonRepository$fetchATEListings$2(ExpireSoonRepository expireSoonRepository, zz.a<? super ExpireSoonRepository$fetchATEListings$2> aVar) {
        super(2, aVar);
        this.this$0 = expireSoonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonRepository$fetchATEListings$2(this.this$0, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends AboutToExpireListing>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<AboutToExpireListing>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b0 b0Var;
        b0 b0Var2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, anonymousClass1, this);
            if (obj == f11) {
                return f11;
            }
        }
        ExpireSoonRepository expireSoonRepository = this.this$0;
        b0Var = expireSoonRepository.responseTime;
        b0Var.postValue(kotlin.coroutines.jvm.internal.a.e(System.currentTimeMillis()));
        b0Var2 = expireSoonRepository.aboutToExpireListings;
        b0Var2.postValue(((List) obj).iterator());
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<AboutToExpireListing>> aVar) {
        return ((ExpireSoonRepository$fetchATEListings$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
