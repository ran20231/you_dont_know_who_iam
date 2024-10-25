package com.forsale.app.features.more.wanteditems;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import androidx.paging.PagedList;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import je.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import wz.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WantedItemsFragment.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsFragment$loadData$1", f = "WantedItemsFragment.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WantedItemsFragment$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33767a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f33768b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WantedItemsFragment f33769c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WantedItemsFragment.kt */
    @d(c = "com.forsale.app.features.more.wanteditems.WantedItemsFragment$loadData$1$1", f = "WantedItemsFragment.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.wanteditems.WantedItemsFragment$loadData$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33770a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WantedItemsFragment f33771b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WantedItemsFragment.kt */
        /* renamed from: com.forsale.app.features.more.wanteditems.WantedItemsFragment$loadData$1$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements c0, k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f33772a;

            a(b bVar) {
                this.f33772a = bVar;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(PagedList<ItemSubscriptionResponse> pagedList) {
                this.f33772a.f(pagedList);
            }

            @Override // kotlin.jvm.internal.k
            public final e<?> c() {
                return new FunctionReferenceImpl(1, this.f33772a, b.class, "submitList", "submitList(Landroidx/paging/PagedList;)V", 0);
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
        AnonymousClass1(WantedItemsFragment wantedItemsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f33771b = wantedItemsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f33771b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            b d02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f33770a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                WantedItemsViewModel B = this.f33771b.B();
                this.f33770a = 1;
                obj = B.A0(this);
                if (obj == f11) {
                    return f11;
                }
            }
            s viewLifecycleOwner = this.f33771b.getViewLifecycleOwner();
            d02 = this.f33771b.d0();
            ((LiveData) obj).observe(viewLifecycleOwner, new a(d02));
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsFragment$loadData$1(WantedItemsFragment wantedItemsFragment, zz.a<? super WantedItemsFragment$loadData$1> aVar) {
        super(2, aVar);
        this.f33769c = wantedItemsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        WantedItemsFragment$loadData$1 wantedItemsFragment$loadData$1 = new WantedItemsFragment$loadData$1(this.f33769c, aVar);
        wantedItemsFragment$loadData$1.f33768b = obj;
        return wantedItemsFragment$loadData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33767a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33769c, null);
            this.f33767a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f33768b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((WantedItemsFragment$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
