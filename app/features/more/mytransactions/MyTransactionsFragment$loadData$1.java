package com.forsale.app.features.more.mytransactions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import androidx.paging.PagedList;
import com.forsale.app.datalayer.network.entities.MyTransactionEntity;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import wz.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyTransactionsFragment.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionsFragment$loadData$1", f = "MyTransactionsFragment.kt", l = {105, 105}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyTransactionsFragment$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32020a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MyTransactionsFragment f32021b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyTransactionsFragment.kt */
    @d(c = "com.forsale.app.features.more.mytransactions.MyTransactionsFragment$loadData$1$1", f = "MyTransactionsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$loadData$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<LiveData<PagedList<MyTransactionEntity.Record>>, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32022a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f32023b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MyTransactionsFragment f32024c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MyTransactionsFragment.kt */
        /* renamed from: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$loadData$1$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements c0, k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ud.d f32025a;

            a(ud.d dVar) {
                this.f32025a = dVar;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(PagedList<MyTransactionEntity.Record> pagedList) {
                this.f32025a.f(pagedList);
            }

            @Override // kotlin.jvm.internal.k
            public final e<?> c() {
                return new FunctionReferenceImpl(1, this.f32025a, ud.d.class, "submitList", "submitList(Landroidx/paging/PagedList;)V", 0);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof c0) || !(obj instanceof k)) {
                    return false;
                }
                return o.d(c(), ((k) obj).c());
            }

            public final int hashCode() {
                return c().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MyTransactionsFragment myTransactionsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32024c = myTransactionsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(LiveData<PagedList<MyTransactionEntity.Record>> liveData, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(liveData, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32024c, aVar);
            anonymousClass1.f32023b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ud.d V;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f32022a == 0) {
                f.b(obj);
                LiveData liveData = (LiveData) this.f32023b;
                if (liveData != null) {
                    s viewLifecycleOwner = this.f32024c.getViewLifecycleOwner();
                    V = this.f32024c.V();
                    liveData.observe(viewLifecycleOwner, new a(V));
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionsFragment$loadData$1(MyTransactionsFragment myTransactionsFragment, zz.a<? super MyTransactionsFragment$loadData$1> aVar) {
        super(2, aVar);
        this.f32021b = myTransactionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyTransactionsFragment$loadData$1(this.f32021b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32020a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            MyTransactionsViewModel B = this.f32021b.B();
            this.f32020a = 1;
            obj = B.H0(this);
            if (obj == f11) {
                return f11;
            }
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32021b, null);
        this.f32020a = 2;
        if (CoroutinesExtensionsKt.a(obj, anonymousClass1, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyTransactionsFragment$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
