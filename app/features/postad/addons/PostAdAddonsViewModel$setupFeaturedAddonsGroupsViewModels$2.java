package com.forsale.app.features.postad.addons;

import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.postad.addons.featured.FeaturedAddonItemViewModel;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2", f = "PostAdAddonsViewModel.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34372a;

    /* renamed from: b  reason: collision with root package name */
    int f34373b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f34374c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34375d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<AddonsGroup> f34376e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2(PostAdAddonsViewModel postAdAddonsViewModel, List<AddonsGroup> list, zz.a<? super PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2> aVar) {
        super(2, aVar);
        this.f34375d = postAdAddonsViewModel;
        this.f34376e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2 postAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2 = new PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2(this.f34375d, this.f34376e, aVar);
        postAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2.f34374c = obj;
        return postAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        int y11;
        MutableSharedFlow mutableSharedFlow;
        PostAdAddonsViewModel postAdAddonsViewModel;
        List list;
        ListingDetailsEntity listingDetailsEntity;
        g00.a aVar;
        ApplicationResourcesRepository applicationResourcesRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34373b;
        if (i11 != 0) {
            if (i11 == 1) {
                postAdAddonsViewModel = (PostAdAddonsViewModel) this.f34372a;
                list = (List) this.f34374c;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.f34374c;
            PostAdAddonsViewModel postAdAddonsViewModel2 = this.f34375d;
            ArrayList<AddonsGroup> arrayList = new ArrayList();
            for (Object obj2 : this.f34376e) {
                if (!((AddonsGroup) obj2).getAddons().isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            final PostAdAddonsViewModel postAdAddonsViewModel3 = this.f34375d;
            y11 = s.y(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (AddonsGroup addonsGroup : arrayList) {
                CoroutineScope a11 = r0.a(postAdAddonsViewModel3);
                listingDetailsEntity = postAdAddonsViewModel3.f34325r0;
                aVar = postAdAddonsViewModel3.H0;
                applicationResourcesRepository = postAdAddonsViewModel3.f34322o0;
                CategoryRuleSet.RuleSet value = postAdAddonsViewModel3.e1().d2().getValue();
                o.f(value);
                FeaturedAddonItemViewModel featuredAddonItemViewModel = new FeaturedAddonItemViewModel(a11, addonsGroup, listingDetailsEntity, aVar, applicationResourcesRepository, value, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2$2$viewModels$1

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: PostAdAddonsViewModel.kt */
                    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2$2$viewModels$1$1", f = "PostAdAddonsViewModel.kt", l = {267}, m = "invokeSuspend")
                    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2$2$viewModels$1$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                        /* renamed from: a  reason: collision with root package name */
                        int f34379a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ PostAdAddonsViewModel f34380b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(PostAdAddonsViewModel postAdAddonsViewModel, zz.a<? super AnonymousClass1> aVar) {
                            super(2, aVar);
                            this.f34380b = postAdAddonsViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                            return new AnonymousClass1(this.f34380b, aVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object f11;
                            MutableSharedFlow mutableSharedFlow;
                            f11 = kotlin.coroutines.intrinsics.b.f();
                            int i11 = this.f34379a;
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    f.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                f.b(obj);
                                mutableSharedFlow = this.f34380b.C0;
                                wz.p pVar = wz.p.f75480a;
                                this.f34379a = 1;
                                if (mutableSharedFlow.emit(pVar, this) == f11) {
                                    return f11;
                                }
                            }
                            return wz.p.f75480a;
                        }

                        @Override // g00.p
                        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(postAdAddonsViewModel3, null), 3, null);
                    }
                }, postAdAddonsViewModel3);
                postAdAddonsViewModel3.D1(featuredAddonItemViewModel.n());
                arrayList2.add(featuredAddonItemViewModel);
            }
            mutableSharedFlow = this.f34375d.f34329v0;
            this.f34374c = arrayList2;
            this.f34372a = postAdAddonsViewModel2;
            this.f34373b = 1;
            if (mutableSharedFlow.emit(arrayList2, this) == f11) {
                return f11;
            }
            postAdAddonsViewModel = postAdAddonsViewModel2;
            list = arrayList2;
        }
        postAdAddonsViewModel.F0 = list;
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$setupFeaturedAddonsGroupsViewModels$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
