package com.team.web.izzifile;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QIzziFile is a Querydsl query type for IzziFile
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIzziFile extends EntityPathBase<IzziFile> {

    private static final long serialVersionUID = 1194666384L;

    public static final QIzziFile izziFile = new QIzziFile("izziFile");

    public final DatePath<java.time.LocalDate> fileDate = createDate("fileDate", java.time.LocalDate.class);

    public final NumberPath<Long> fileId = createNumber("fileId", Long.class);

    public final StringPath fileName = createString("fileName");

    public final StringPath fileSize = createString("fileSize");

    public final StringPath fileType = createString("fileType");

    public final StringPath uploadId = createString("uploadId");

    public QIzziFile(String variable) {
        super(IzziFile.class, forVariable(variable));
    }

    public QIzziFile(Path<? extends IzziFile> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIzziFile(PathMetadata metadata) {
        super(IzziFile.class, metadata);
    }

}

