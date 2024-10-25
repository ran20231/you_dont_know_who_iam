package com.forsale.app.features.postad.addons;

import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItem;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$4", f = "PostAdAddonsFragment.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34286a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34287b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$4$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<List<? extends AddonsGroupItemViewModel>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34288a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34289b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34290c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34290c = postAdAddonsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(List<AddonsGroupItemViewModel> list, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(list, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34290c, aVar);
            anonymousClass1.f34289b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            lr.a aVar;
            int y11;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34288a == 0) {
                f.b(obj);
                List list = (List) this.f34289b;
                if (list != null) {
                    List<AddonsGroupItemViewModel> list2 = list;
                    PostAdAddonsFragment postAdAddonsFragment = this.f34290c;
                    y11 = s.y(list2, 10);
                    arrayList = new ArrayList(y11);
                    for (AddonsGroupItemViewModel addonsGroupItemViewModel : list2) {
                        arrayList.add(new AddonsGroupItem(addonsGroupItemViewModel, postAdAddonsFragment, postAdAddonsFragment.B()));
                    }
                } else {
                    arrayList = null;
                }
                PostAdAddonsFragment postAdAddonsFragment2 = this.f34290c;
                if (arrayList != null) {
                    aVar = postAdAddonsFragment2.O;
                    aVar.m(arrayList);
                }
                PostAdAddonsFragment.S(postAdAddonsFragment2).O.C1(0);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsFragment$setupBinding$4(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$4> aVar) {
        super(1, aVar);
        this.f34287b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$4(this.f34287b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34286a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<List<AddonsGroupItemViewModel>> i12 = this.f34287b.B().i1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34287b, null);
            this.f34286a = 1;
            if (FlowKt.collectLatest(i12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
