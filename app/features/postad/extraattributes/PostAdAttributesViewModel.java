package com.forsale.app.features.postad.extraattributes;

import androidx.databinding.ObservableInt;
import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.services.UploaderServices;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.MutexIsLockedException;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.MultipartBody;
import wz.h;
import wz.p;
/* compiled from: PostAdAttributesViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel extends BaseStatefulViewModel {

    /* renamed from: x0  reason: collision with root package name */
    public static final b f35113x0 = new b(null);

    /* renamed from: y0  reason: collision with root package name */
    public static final int f35114y0 = 8;

    /* renamed from: z0  reason: collision with root package name */
    private static final h<Mutex> f35115z0;

    /* renamed from: l0  reason: collision with root package name */
    private final PostAdViewModel f35116l0;

    /* renamed from: m0  reason: collision with root package name */
    private final UploaderServices f35117m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ExtraAttributeRawRepository f35118n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ApplicationResourcesRepository f35119o0;

    /* renamed from: p0  reason: collision with root package name */
    private final jj.b f35120p0;

    /* renamed from: q0  reason: collision with root package name */
    private final CoroutineExceptionHandler f35121q0;

    /* renamed from: r0  reason: collision with root package name */
    private final MutableStateFlow<p> f35122r0;

    /* renamed from: s0  reason: collision with root package name */
    private final SharedFlow<p> f35123s0;

    /* renamed from: t0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35124t0;

    /* renamed from: u0  reason: collision with root package name */
    private final SharedFlow<p> f35125u0;

    /* renamed from: v0  reason: collision with root package name */
    private final ArrayList<AttributesGroupItemViewModel> f35126v0;

    /* renamed from: w0  reason: collision with root package name */
    private final ObservableInt f35127w0;

    /* compiled from: PostAdAttributesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f35129a;

        /* renamed from: b  reason: collision with root package name */
        private final File f35130b;

        /* renamed from: c  reason: collision with root package name */
        private final MultipartBody.Part f35131c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f35132d;

        public a(int i11, File file) {
            o.i(file, "file");
            this.f35129a = i11;
            this.f35130b = file;
            this.f35131c = TopLevelUtilityFunctionsKt.c("file", file);
        }

        public final int a() {
            return this.f35129a;
        }

        public final File b() {
            return this.f35130b;
        }

        public final MultipartBody.Part c() {
            return this.f35131c;
        }

        public final boolean d() {
            return this.f35132d;
        }

        public final void e(boolean z11) {
            this.f35132d = z11;
        }
    }

    /* compiled from: PostAdAttributesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Mutex b() {
            return (Mutex) PostAdAttributesViewModel.f35115z0.getValue();
        }
    }

    /* compiled from: PostAdAttributesViewModel.kt */
    /* loaded from: classes2.dex */
    public interface c {
        PostAdAttributesViewModel a(PostAdViewModel postAdViewModel);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdAttributesViewModel f35138a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, PostAdAttributesViewModel postAdAttributesViewModel) {
            super(key);
            this.f35138a = postAdAttributesViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (!(th2 instanceof MutexIsLockedException)) {
                this.f35138a.H0(th2);
                this.f35138a.v0().postValue(ViewStates.CONTENT);
                return;
            }
            x10.a.c(th2);
        }
    }

    static {
        h<Mutex> a11;
        a11 = kotlin.d.a(new g00.a<Mutex>() { // from class: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$Companion$mutex$2
            @Override // g00.a
            public final Mutex invoke() {
                return MutexKt.Mutex$default(false, 1, null);
            }
        });
        f35115z0 = a11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel(PostAdViewModel postAdViewModel, UploaderServices uploaderServices, ExtraAttributeRawRepository extraAttributesRepository, ApplicationResourcesRepository resourcesRepository, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(postAdViewModel, "postAdViewModel");
        o.i(uploaderServices, "uploaderServices");
        o.i(extraAttributesRepository, "extraAttributesRepository");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f35116l0 = postAdViewModel;
        this.f35117m0 = uploaderServices;
        this.f35118n0 = extraAttributesRepository;
        this.f35119o0 = resourcesRepository;
        this.f35120p0 = prefs;
        this.f35121q0 = new d(CoroutineExceptionHandler.Key, this);
        MutableStateFlow<p> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f35122r0 = MutableStateFlow;
        this.f35123s0 = FlowKt.asSharedFlow(MutableStateFlow);
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35124t0 = MutableSharedFlow$default;
        this.f35125u0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f35126v0 = new ArrayList<>();
        this.f35127w0 = new ObservableInt(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(Throwable th2) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdAttributesViewModel$checkAndPopulateMessage$1(th2, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:20:0x0056). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$isValidAttributes$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$isValidAttributes$1 r0 = (com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$isValidAttributes$1) r0
            int r1 = r0.f35158d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35158d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$isValidAttributes$1 r0 = new com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$isValidAttributes$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f35156b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f35158d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.f35155a
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.f.b(r5)
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            java.util.ArrayList<com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel> r5 = r4.f35126v0
            java.util.Iterator r5 = r5.iterator()
            r2 = r5
        L3f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L64
            java.lang.Object r5 = r2.next()
            com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel r5 = (com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel) r5
            r0.f35155a = r2
            r0.f35158d = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3f
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        L64:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.T0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        this.f35116l0.I4();
        this.f35116l0.N1(PostAdScreens.ATTRIBUTES_SCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0() {
        if (this.f35116l0.q3()) {
            PostAdViewModel.J3(this.f35116l0, CreateEditAdvActionType.EDIT_MORE_INFORMATION_NEXT_CLICKED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f35116l0, CreateEditAdvActionType.ADD_MORE_INFORMATION_NEXT_CLICKED, null, null, null, null, 30, null);
        }
    }

    private final void X0(int i11) {
        Object obj;
        boolean z11;
        Iterator<T> it2 = this.f35116l0.X1().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((a) obj).a() == i11) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null) {
            this.f35116l0.X1().remove(aVar);
        }
    }

    private final void c1(int i11, String str) {
        Object obj;
        boolean z11;
        Iterator<AttributesGroupItemViewModel> it2 = this.f35126v0.iterator();
        while (it2.hasNext()) {
            Iterator<T> it3 = it2.next().a().iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity = (ExtraAttributeFlatGroupEntity) obj;
                    if (o.d(extraAttributeFlatGroupEntity.getType(), AttributeType.FILE.getValue()) && extraAttributeFlatGroupEntity.getId() == i11) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity2 = (ExtraAttributeFlatGroupEntity) obj;
            if (extraAttributeFlatGroupEntity2 != null) {
                extraAttributeFlatGroupEntity2.setFileName(str);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:31:0x009a, B:33:0x00a0, B:35:0x00ac, B:49:0x0100, B:30:0x008e), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:31:0x009a, B:33:0x00a0, B:35:0x00ac, B:49:0x0100, B:30:0x008e), top: B:54:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:43:0x00e5, B:45:0x00ed, B:47:0x00f3, B:31:0x009a, B:33:0x00a0, B:35:0x00ac, B:49:0x0100, B:30:0x008e), top: B:54:0x0024 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e1 -> B:43:0x00e5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e1(zz.a<? super wz.p> r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.e1(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdAttributesViewModel$validAttributes$1(this, null), 3, null);
    }

    public final Job I0() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdAttributesViewModel$clearLoadAttributeEvent$1(this, null), 3, null);
        return launch$default;
    }

    public final Object J0(zz.a<? super String> aVar) {
        return this.f35120p0.c().a(aVar);
    }

    public final void K0() {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new PostAdAttributesViewModel$getAttributes$1(this, null), 2, null);
    }

    public final ArrayList<AttributesGroupItemViewModel> L0() {
        return this.f35126v0;
    }

    public final ExtraAttributeRawRepository M0() {
        return this.f35118n0;
    }

    public final SharedFlow<p> N0() {
        return this.f35123s0;
    }

    public final PostAdViewModel O0() {
        return this.f35116l0;
    }

    public final ApplicationResourcesRepository P0() {
        return this.f35119o0;
    }

    public final SharedFlow<p> Q0() {
        return this.f35125u0;
    }

    public final void R0() {
        BuildersKt__Builders_commonKt.launch$default(this, this.f35121q0, null, new PostAdAttributesViewModel$handleNextButton$1(this, null), 2, null);
    }

    public final void S0() {
        List<ExtraAttr> list;
        boolean z11;
        Object obj;
        boolean z12;
        ListingDetailsEntity n22 = this.f35116l0.n2();
        if (n22 != null && n22.getExtraAttrs() != null) {
            Iterator<AttributesGroupItemViewModel> it2 = this.f35126v0.iterator();
            while (it2.hasNext()) {
                AttributesGroupItemViewModel next = it2.next();
                if (next.a() != null) {
                    for (ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity : next.a()) {
                        ListingDetailsEntity n23 = this.f35116l0.n2();
                        if (n23 != null) {
                            list = n23.getExtraAttrs();
                        } else {
                            list = null;
                        }
                        o.f(list);
                        Iterator<T> it3 = list.iterator();
                        while (true) {
                            z11 = true;
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (((ExtraAttr) obj).getId() == extraAttributeFlatGroupEntity.getId()) {
                                    z12 = true;
                                    continue;
                                } else {
                                    z12 = false;
                                    continue;
                                }
                                if (z12) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        ExtraAttr extraAttr = (ExtraAttr) obj;
                        if (extraAttr != null) {
                            String type = extraAttributeFlatGroupEntity.getType();
                            if (!o.d(type, AttributeType.TEXT.getValue())) {
                                z11 = o.d(type, AttributeType.NUMBER.getValue());
                            }
                            if (z11) {
                                extraAttributeFlatGroupEntity.setTextNumValue(extraAttr.getValue());
                            } else if (o.d(type, AttributeType.BOOL.getValue())) {
                                extraAttributeFlatGroupEntity.setChecked(TypeExtensionsKt.h0(Integer.parseInt(extraAttr.getValue())));
                            } else if (o.d(type, AttributeType.DROP_DOWN.getValue())) {
                                extraAttributeFlatGroupEntity.setOptionId(Integer.parseInt(extraAttr.getValue()));
                            } else if (o.d(type, AttributeType.FILE.getValue())) {
                                extraAttributeFlatGroupEntity.setFileName(extraAttr.getValue());
                            }
                        }
                    }
                }
            }
        }
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdAttributesViewModel$initItemViewModels$2(this, null), 3, null);
    }

    public final void W0() {
        if (this.f35116l0.q3()) {
            PostAdViewModel.J3(this.f35116l0, CreateEditAdvActionType.EDIT_MORE_INFORMATION_VISITED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f35116l0, CreateEditAdvActionType.ADD_MORE_INFORMATION_VISITED, null, null, null, null, 30, null);
        }
    }

    public final void Y0(int i11) {
        b1(-1);
        X0(i11);
    }

    public final void Z0(File file) {
        o.i(file, "file");
        X0(this.f35127w0.j());
        this.f35116l0.X1().add(new a(this.f35127w0.j(), file));
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdAttributesViewModel$setSelectedAttributeFile$1(this, file, null), 3, null);
    }

    public final void b1(int i11) {
        this.f35127w0.k(i11);
    }

    public final void d1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdAttributesViewModel$updateListing$1(this, null), 3, null);
    }
}
