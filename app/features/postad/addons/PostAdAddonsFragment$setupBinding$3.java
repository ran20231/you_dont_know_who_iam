package com.forsale.app.features.postad.addons;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.postad.addons.featured.FeaturedAddonItem;
import com.forsale.app.features.postad.addons.featured.FeaturedAddonItemViewModel;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$3", f = "PostAdAddonsFragment.kt", l = {180}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34281a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34282b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$3$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<List<? extends FeaturedAddonItemViewModel>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34283a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34284b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34285c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34285c = postAdAddonsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(List<FeaturedAddonItemViewModel> list, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(list, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34285c, aVar);
            anonymousClass1.f34284b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int y11;
            lr.a aVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34283a == 0) {
                f.b(obj);
                List list = (List) this.f34284b;
                if (list != null) {
                    List<FeaturedAddonItemViewModel> list2 = list;
                    PostAdAddonsFragment postAdAddonsFragment = this.f34285c;
                    y11 = s.y(list2, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (FeaturedAddonItemViewModel featuredAddonItemViewModel : list2) {
                        androidx.lifecycle.s viewLifecycleOwner = postAdAddonsFragment.getViewLifecycleOwner();
                        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        FragmentManager childFragmentManager = postAdAddonsFragment.getChildFragmentManager();
                        o.h(childFragmentManager, "getChildFragmentManager(...)");
                        arrayList.add(new FeaturedAddonItem(viewLifecycleOwner, featuredAddonItemViewModel, childFragmentManager));
                    }
                    aVar = this.f34285c.N;
                    aVar.m(arrayList);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsFragment$setupBinding$3(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$3> aVar) {
        super(1, aVar);
        this.f34282b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$3(this.f34282b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34281a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<List<FeaturedAddonItemViewModel>> k12 = this.f34282b.B().k1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34282b, null);
            this.f34281a = 1;
            if (FlowKt.collectLatest(k12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
