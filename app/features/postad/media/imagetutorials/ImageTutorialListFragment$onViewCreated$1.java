package com.forsale.app.features.postad.media.imagetutorials;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: ImageTutorialListFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListFragment$onViewCreated$1", f = "ImageTutorialListFragment.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ImageTutorialListFragment$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35922a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImageTutorialListFragment f35923b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageTutorialListFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListFragment$onViewCreated$1$1", f = "ImageTutorialListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<List<? extends CategoryRuleSet.Tutorial>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35924a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35925b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ImageTutorialListFragment f35926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ImageTutorialListFragment imageTutorialListFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35926c = imageTutorialListFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(List<CategoryRuleSet.Tutorial> list, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(list, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35926c, aVar);
            anonymousClass1.f35925b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ze.b bVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35924a == 0) {
                kotlin.f.b(obj);
                List list = (List) this.f35925b;
                if (list != null) {
                    bVar = this.f35926c.E;
                    bVar.submitList(new ArrayList(list));
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialListFragment$onViewCreated$1(ImageTutorialListFragment imageTutorialListFragment, zz.a<? super ImageTutorialListFragment$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f35923b = imageTutorialListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new ImageTutorialListFragment$onViewCreated$1(this.f35923b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35922a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<List<CategoryRuleSet.Tutorial>> z02 = this.f35923b.B().z0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35923b, null);
            this.f35922a = 1;
            if (FlowKt.collectLatest(z02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((ImageTutorialListFragment$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
