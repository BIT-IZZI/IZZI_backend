package com.team.web.izzifile;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QIzziFileDB is a Querydsl query type for IzziFileDB
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIzziFileDB extends EntityPathBase<IzziFileDB> {

    private static final long serialVersionUID = 1318129166L;

    public static final QIzziFileDB izziFileDB = new QIzziFileDB("izziFileDB");

    public final ArrayPath<byte[], Byte> data = createArray("data", byte[].class);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath type = createString("type");

    public QIzziFileDB(String variable) {
        super(IzziFileDB.class, forVariable(variable));
    }

    public QIzziFileDB(Path<? extends IzziFileDB> path) {
        super(path.getType(), path.getMetadata());
    }

    public QIzziFileDB(PathMetadata metadata) {
        super(IzziFileDB.class, metadata);
    }

}

