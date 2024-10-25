package com.forsale.app.features.postad.addons.featured;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment;
import g00.l;
import g00.p;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonItem.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$1", f = "FeaturedAddonItem.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeaturedAddonItem$ViewHolder$bindView$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34688a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonItem f34689b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonItemViewModel f34690c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FeaturedAddonItem.kt */
    @d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$1$1", f = "FeaturedAddonItem.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34691a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeaturedAddonItemViewModel f34692b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FeaturedAddonItem f34693c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FeaturedAddonItem.kt */
        @d(c = "com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$1$1$1", f = "FeaturedAddonItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03841 extends SuspendLambda implements p<Pair<? extends AddonsGroup, ? extends ListingDetailsEntity>, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34694a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f34695b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ FeaturedAddonItem f34696c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FeaturedAddonItem.kt */
            /* renamed from: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem$ViewHolder$bindView$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C03851 extends FunctionReferenceImpl implements l<Set<? extends Addon>, wz.p> {
                C03851(Object obj) {
                    super(1, obj, FeaturedAddonItemViewModel.class, "onAddonSelectorResult", "onAddonSelectorResult(Ljava/util/Set;)V", 0);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(Set<? extends Addon> set) {
                    m(set);
                    return wz.p.f75480a;
                }

                public final void m(Set<Addon> set) {
                    ((FeaturedAddonItemViewModel) this.receiver).s(set);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03841(FeaturedAddonItem featuredAddonItem, a<? super C03841> aVar) {
                super(2, aVar);
                this.f34696c = featuredAddonItem;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(Pair<AddonsGroup, ListingDetailsEntity> pair, a<? super wz.p> aVar) {
                return ((C03841) create(pair, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C03841 c03841 = new C03841(this.f34696c, aVar);
                c03841.f34695b = obj;
                return c03841;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                FragmentManager fragmentManager;
                b.f();
                if (this.f34694a == 0) {
                    f.b(obj);
                    Pair pair = (Pair) this.f34695b;
                    if (pair != null) {
                        FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment = new FeaturedAddonsSelectorDialogFragment((AddonsGroup) pair.c(), (ListingDetailsEntity) pair.d(), new C03851(this.f34696c.f34683g));
                        fragmentManager = this.f34696c.f34684h;
                        featuredAddonsSelectorDialogFragment.show(fragmentManager, (String) null);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(FeaturedAddonItemViewModel featuredAddonItemViewModel, FeaturedAddonItem featuredAddonItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34692b = featuredAddonItemViewModel;
            this.f34693c = featuredAddonItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f34692b, this.f34693c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f34691a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<Pair<AddonsGroup, ListingDetailsEntity>> k11 = this.f34692b.k();
                C03841 c03841 = new C03841(this.f34693c, null);
                this.f34691a = 1;
                if (FlowKt.collectLatest(k11, c03841, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonItem$ViewHolder$bindView$1$1(FeaturedAddonItem featuredAddonItem, FeaturedAddonItemViewModel featuredAddonItemViewModel, a<? super FeaturedAddonItem$ViewHolder$bindView$1$1> aVar) {
        super(2, aVar);
        this.f34689b = featuredAddonItem;
        this.f34690c = featuredAddonItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FeaturedAddonItem$ViewHolder$bindView$1$1(this.f34689b, this.f34690c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f34688a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f34689b.f34682f;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34690c, this.f34689b, null);
            this.f34688a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FeaturedAddonItem$ViewHolder$bindView$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
